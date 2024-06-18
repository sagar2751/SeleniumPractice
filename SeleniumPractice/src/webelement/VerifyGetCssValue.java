package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyGetCssValue 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createNewAccountLink = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String createNewAccountBackgroundColor = createNewAccountLink.getCssValue("background-color");
		System.out.println("createNewAccountBackgroundColor = " + createNewAccountBackgroundColor);  
		// createNewAccountBackgroundColor = rgba(66, 183, 42, 1)
		String convertedValue = Color.fromString(createNewAccountBackgroundColor).asHex();
		System.out.println("convertedValue = " + convertedValue); 
		// createNewAccountBackgroundColor = rgba(66, 183, 42, 1) convertedValue = #42b72a
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
