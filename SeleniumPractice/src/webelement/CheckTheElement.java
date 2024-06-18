package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		if (loginButton.isEnabled()) 
		{
			loginButton.click();
			Thread.sleep(2000);
		} 
		else 
		{
			System.out.println("The login button is not enabled");
		}
		driver.quit();
	}

}
