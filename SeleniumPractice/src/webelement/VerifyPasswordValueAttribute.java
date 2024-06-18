package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPasswordValueAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		String passwordValue = passwordTextField.getAttribute("value");
		Thread.sleep(2000);
		System.out.println("passwordValue = " + passwordValue);  
		// O/P: usernameValue = admin we got usernameValue as it is already available in the website
		if (passwordValue.isEmpty()) 
		{
			passwordTextField.sendKeys("ADMIN");
			Thread.sleep(2000);
		}
		else
		{
			passwordTextField.clear();
			Thread.sleep(2000);
			passwordTextField.sendKeys("admin");
			Thread.sleep(2000);      
			// O/P: usernameValue = admin got the output as expected and it is also running according to the instructions given
		}
		driver.quit();
	}

}
