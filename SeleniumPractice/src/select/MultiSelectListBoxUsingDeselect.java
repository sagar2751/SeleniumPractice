package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBoxUsingDeselect 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select multiSelectItems = new Select(price);
		multiSelectItems.selectByIndex(0);
		multiSelectItems.selectByValue("99");
		multiSelectItems.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		
		multiSelectItems.deselectByIndex(0);
		multiSelectItems.deselectByValue("99");
		multiSelectItems.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
	}

}
