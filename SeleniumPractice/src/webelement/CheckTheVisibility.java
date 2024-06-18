package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckTheVisibility 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		if (monthDropDown.isDisplayed()) 
		{
			System.out.println("monthDropDown is displayed");   // O/P: monthDropDown is displayed if block got executed
		}
		else
		{
			System.out.println("monthDropDown is not displayed");
		}
		
		WebElement hiddenElement = driver.findElement(By.name("preferred_pronoun"));
		if (hiddenElement.isDisplayed()) 
		{
			System.out.println("hiddenElement is displayed");	
		} 
		else 
		{
			driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']")).click();
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
