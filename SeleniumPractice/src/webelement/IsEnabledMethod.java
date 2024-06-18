package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.name("submit"));
		Thread.sleep(2000);
		
		if (submitButton.isEnabled()) 
		{
			submitButton.click();	
		}
		else
		{
			WebElement acceptTermsAndConditionsOption = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
			acceptTermsAndConditionsOption.click();
			Thread.sleep(2000);
			
			WebElement acceptTermsAndConditionsCheckBox = driver.findElement(By.id("confbtn"));
			acceptTermsAndConditionsCheckBox.click();
			Thread.sleep(2000);
			
			WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
			closeButton.click();
			Thread.sleep(2000);
			
			submitButton.click();
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
