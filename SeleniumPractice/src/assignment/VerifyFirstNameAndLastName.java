package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFirstNameAndLastName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement firstNameTextField = driver.findElement(By.name("firstname"));
		int firstNameWidth = firstNameTextField.getSize().getWidth();
		System.out.println("firstNameWidth = " + firstNameWidth);    // O/P: firstNameWidth = 194
		int firstNameHeight = firstNameTextField.getSize().getHeight();
		System.out.println("firstNameHeight = " + firstNameHeight);  // O/P: firstNameHeight = 40
		
		WebElement lastNameTextField = driver.findElement(By.name("lastname"));
		int lastNameWidth = lastNameTextField.getSize().getWidth();
		System.out.println("lastNameWidth = " + lastNameWidth);         // O/P: lastNameWidth = 194
		int lastNameHeilght = lastNameTextField.getSize().getHeight();
		System.out.println("lastNameHeilght = " + lastNameHeilght);    // O/P: lastNameHeilght = 40
		
		if (firstNameWidth==lastNameWidth && firstNameHeight==lastNameHeilght) 
		{
			System.out.println("The size of the text field is verified and it is correct");
		}
		else
		{
			System.out.println("The size of the text field is verified and it is incorrect");
		}
		driver.quit();
	}

}

//firstNameWidth = 194
//firstNameHeight = 40
//lastNameWidth = 194
//lastNameHeilght = 40
//The size of the text field is verified and it is correct

