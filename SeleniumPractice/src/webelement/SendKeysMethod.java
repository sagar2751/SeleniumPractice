package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SendKeysMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("ABCD");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.quit();
		//Executed all the instructions and also the page got successfully loaded without any error....
	}

}
