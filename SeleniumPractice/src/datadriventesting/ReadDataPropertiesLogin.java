package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataPropertiesLogin 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		String URL = prop.getProperty("url");
		String Email = prop.getProperty("email");
		String Password = prop.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.click();
		emailTextField.sendKeys(Email);
		
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		passwordTextField.click();
		passwordTextField.sendKeys(Password);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
		WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Log out']"));
		logoutLink.click();
		
	}

}
