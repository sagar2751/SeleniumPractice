package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect_Multiple 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select multipleSelectItems = new Select(price);
		multipleSelectItems.selectByIndex(0);
		multipleSelectItems.selectByValue("199");
		multipleSelectItems.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		
		System.out.println(multipleSelectItems.isMultiple());
		
	}

}
