package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsLocators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver.manage().window().maximize(); // pre-condition
		Thread.sleep(2000);
		
		WebElement emailOrMobile = driver.findElement(By.cssSelector("input[placeholder=\"Email or phone\"]"));
		emailOrMobile.sendKeys("sagar@123"); 
		
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
		password.sendKeys("Sniper@2751*");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		driver.manage().window().minimize();
		
		//WebElement emailOrMobile = driver.findElement(By.cssSelector("input[placeholder=\"Email address or mobile number\"]"));
		//emailOrMobile.sendKeys("sagar@123");
	}


}
