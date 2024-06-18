package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMobileNumberAndPasswordTextField 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement mobileNumberTextField = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		int mobileNumberWidth = mobileNumberTextField.getSize().getWidth();  
		System.out.println("mobileNumberWidth = " + mobileNumberWidth);   // O/P: mobileNumberWidth = 399
		int mobileNumberHeight = mobileNumberTextField.getSize().getHeight();
		System.out.println("mobileNumberHeight = " + mobileNumberHeight);    // O/P: mobileNumberHeight = 40
		
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@type='password']"));
		int passwordWidth = passwordTextField.getSize().getWidth();
		System.out.println("passwordWidth = " + passwordWidth);    // O/P: passwordWidth = 399
		int passwordHeight = passwordTextField.getSize().getHeight();
		System.out.println("passwordHeight = " + passwordHeight);     // O/P: passwordHeight = 40
		
		if (mobileNumberWidth==passwordWidth && mobileNumberHeight==passwordHeight) 
		{
			System.out.println("The size of the mobile number text field is verified and it is correct");
		}
		else
		{
			System.out.println("The size of the password text field is verified and it is correct");
		}
		driver.quit();
	}

}

//Output for the program
//mobileNumberWidth = 399
//mobileNumberHeight = 40
//passwordWidth = 399
//passwordHeight = 40
//The size of the mobile number text field is verified and it is correct
