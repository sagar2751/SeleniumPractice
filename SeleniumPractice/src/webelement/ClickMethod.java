package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Clicking on an element in a static page that is outside the view port
		//click() supports scrolling to an element (not in view port) in a static page
		driver.findElement(By.linkText("Contact uploading and non-users")).click();
		Thread.sleep(2000);
		
	}

}
