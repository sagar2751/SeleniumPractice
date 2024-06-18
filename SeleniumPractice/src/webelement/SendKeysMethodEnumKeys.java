package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeysMethodEnumKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.chord("ABCD"));
		Thread.sleep(2000);               // This element has added all the elements and also got the output as preferred
		
	}

}
