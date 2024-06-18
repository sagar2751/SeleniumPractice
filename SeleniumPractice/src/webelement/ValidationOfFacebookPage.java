package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationOfFacebookPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String facebookLoginTitle = driver.getTitle();
		System.out.println("facebookLoginTitle = " + facebookLoginTitle);  // O/P: title: facebookLoginTitle = Facebook – log in or sign up
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("sagarsms1@gmail.com");
		
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("Sniper@2751*");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		
		if (loginButton.isEnabled()) 
		{
			loginButton.click();
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("The login button is not enabled......");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
