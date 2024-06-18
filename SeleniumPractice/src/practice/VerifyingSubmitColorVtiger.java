package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyingSubmitColorVtiger 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		
		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		String signInBackgroundColor = signInButton.getCssValue("background-color");
		System.out.println("signInBackgroundColor =" + signInBackgroundColor);  // O/P: signBackgroundColor =rgba(0, 0, 0, 0)
		String convertedValue = Color.fromString(signInBackgroundColor).asHex();
		System.out.println("convertedValue = " + convertedValue);   // O/P: convertedValue = #000000
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
