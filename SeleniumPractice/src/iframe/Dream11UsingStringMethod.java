package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11UsingStringMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		
		WebElement regEmail = driver.findElement(By.id("regEmail"));
		regEmail.sendKeys("12345");
		
		WebElement regUser = driver.findElement(By.id("regUser"));
		regUser.click();
		
		WebElement errorMessage = driver.findElement(By.id("errorMob"));
		System.out.println(errorMessage.getText());  // O/P: Please enter a valid 10 digit mobile number.
		
		driver.switchTo().defaultContent();
		WebElement hamburgerClick = driver.findElement(By.id("hamburger"));
		hamburgerClick.click();
		
	}

}
