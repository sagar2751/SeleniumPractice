package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceHolderForPassword 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		String placeHolderValue = passwordTextField.getAttribute("placeholder");
		Thread.sleep(2000);
		System.out.println("placeHolderValue = " + placeHolderValue);  
		// O/P: value of placeholder is displayed placeHolderValue = Password
		Thread.sleep(2000);
		driver.quit();
		
	}

}
