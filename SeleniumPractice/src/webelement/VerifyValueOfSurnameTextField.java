package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyValueOfSurnameTextField 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement lastNameTextField = driver.findElement(By.name("lastname"));
		String lastNameTextFieldValue = lastNameTextField.getAttribute("value");
		System.out.println("lastNameTextFieldValue = " + lastNameTextFieldValue);  
		// O/P: lastNameTextFieldValue = is providing empty string because we have inserted the value and the value is not by default
		if (lastNameTextFieldValue.isEmpty()) 
		{
			lastNameTextField.sendKeys("nanba");
			Thread.sleep(2000);
		}
		else
		{
			lastNameTextField.clear();
			lastNameTextField.sendKeys("NANBA");
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
