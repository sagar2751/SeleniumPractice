package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfId 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("sagarsms1@gmail.com");
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("Sniper@2751*");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
