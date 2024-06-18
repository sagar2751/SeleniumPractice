package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheYAxisForTheElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(2000);
		
		WebElement emailTextField = driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
		int emailWidth = emailTextField.getRect().getWidth();
		System.out.println("emailXWidth = " + emailWidth);    
		// O/P: emailXWidth = 188
		int emailHeight = emailTextField.getRect().getHeight();
		System.out.println("emailHeight = " + emailHeight);  
		// O/P: emailHeight = 40
		int emailXAxis = emailTextField.getRect().getX();
		System.out.println("emailXAxis = " + emailXAxis);   
		// O/P: emailXAxis = 884
		int emailYAxis = emailTextField.getRect().getY();
		System.out.println("emailYAxis = " + emailYAxis);   
		// O/P: emailYAxis = 8
		
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		int passwordWidth = passwordTextField.getRect().getWidth();
		System.out.println("passwordWidth = " + passwordWidth);  
		// O/P: passwordWidth = 188
		int passwordHeight = passwordTextField.getRect().getHeight();
		System.out.println("passwordHeight = " + passwordHeight);  
		// O/P: passwordHeight = 40
		int passwordXAxis = passwordTextField.getRect().getX();
		System.out.println("passwordXAxis = " + passwordXAxis); 
		// O/P: passwordXAxis = 1080
		int passwordYAxis = passwordTextField.getRect().getY();
		System.out.println("passwordYAxis = " + passwordYAxis);  
		// O/P: passwordYAxis = 8
		
		if (emailYAxis==passwordYAxis) 
		{
			System.out.println("The size of email and password text field is verified and found correct");
		}
		else
		{
			System.out.println("The size of email and password text field is verified and found incorrect");
		}
	}

}

//O/P:
//emailXWidth = 188
//emailHeight = 40
//emailXAxis = 884
//emailYAxis = 8
//passwordWidth = 1881
//passwordHeight = 40
//passwordXAxis = 1080
//passwordYAxis = 8
//The size of email and password text field is verified and found correct
