package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyValueOfFirstNameTextField 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement firstNameTextField = driver.findElement(By.name("firstname"));
		String firstNameTextFieldValue = firstNameTextField.getAttribute("value");
		System.out.println("firstNameTextFieldValue = " + firstNameTextFieldValue);  
		// O/P: firstNameTextFieldValue = is providing empty string because we have inserted the value and the value is not by default
		if (firstNameTextFieldValue.isEmpty()) 
		{
			firstNameTextField.sendKeys("qsp");
			Thread.sleep(2000);
		}
		else
		{
			firstNameTextField.clear();
			firstNameTextField.sendKeys("QSP");
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
