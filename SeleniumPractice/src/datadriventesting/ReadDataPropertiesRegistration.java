package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataPropertiesRegistration 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String URL = prop.getProperty("url");
		String FirstName = prop.getProperty("firstname");
		String LastName = prop.getProperty("lastname");
		String Email = prop.getProperty("email");
		String Password = prop.getProperty("password");
		String ConfirmPassword = prop.getProperty("confirmpassword");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		maleRadioButton.click();
		
		WebElement firstNameTextField = driver.findElement(By.id("FirstName"));
		firstNameTextField.click();
		firstNameTextField.sendKeys(FirstName);
		
		WebElement lastNameTextField = driver.findElement(By.id("LastName"));
		lastNameTextField.click();
		lastNameTextField.sendKeys(LastName);
		
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.click();
		emailTextField.sendKeys(Email);
		
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		passwordTextField.click();
		passwordTextField.sendKeys(Password);
		
		WebElement confirmPasswordTextField = driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordTextField.click();
		confirmPasswordTextField.sendKeys(ConfirmPassword);
		
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		
	}

}
