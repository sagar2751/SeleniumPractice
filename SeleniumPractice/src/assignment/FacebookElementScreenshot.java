package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookElementScreenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//String timeStamp = LocalDateTime.now().toString().replace(':','-');
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sagarsms1@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("Sniper@2751*");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement searchTextField = driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
		searchTextField.sendKeys("Neha Naik");
		searchTextField.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement photoOfGirlFriend = driver.findElement(By.xpath("//div[@class='x1jx94hy x14yjl9h xudhj91 x18nykt9 xww2gxu x1iorvi4 x150jy0e xjkvuk6 x1e558r4']/a"));
		photoOfGirlFriend.click();
		
		
		//driver.quit();
		
	}

}
