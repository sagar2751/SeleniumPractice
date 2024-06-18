package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dayBox = new Select(dayDropDown);
		dayBox.selectByIndex(17);
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthBox = new Select(monthDropDown);
		monthBox.selectByValue("7");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearBox = new Select(yearDropDown);
		yearBox.selectByVisibleText("1992");
		
	}

}
