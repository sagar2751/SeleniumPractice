package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect_Multiple_Elements 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select multipleSelectItems = new Select(price);
		//selecting multiple items
		multipleSelectItems.selectByIndex(0);
		multipleSelectItems.selectByValue("199");
		multipleSelectItems.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		
		//deselecting the items which we have selected
		multipleSelectItems.deselectByVisibleText("Free ( 90 )");
		multipleSelectItems.deselectByIndex(2);
		multipleSelectItems.deselectByValue("99");
		
		System.out.println(multipleSelectItems.isMultiple());
		
	}

}
