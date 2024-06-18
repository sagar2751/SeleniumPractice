package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayDropDownBox = new Select(dayDropDown);
		dayDropDownBox.selectByIndex(17);
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthDropDownBox = new Select(monthDropDown);
		monthDropDownBox.selectByValue("7");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearDropDownBox = new Select(yearDropDown);
		yearDropDownBox.selectByVisibleText("1992");
		
		System.out.println(dayDropDownBox.isMultiple());
		System.out.println(monthDropDownBox.isMultiple());
		System.out.println(yearDropDownBox.isMultiple());
		
		//driver.quit();
	}

}
