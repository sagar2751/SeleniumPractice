package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceHolder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.id("email"));
		String placeHolderValue = emailTextField.getAttribute("placeholder");
		System.out.println("placeHolderValue = " + placeHolderValue); 
		// O/P: value of placeholder is displayed in output placeHolderValue = Email address or phone number
		Thread.sleep(2000);
		driver.quit();
		
	}

}
