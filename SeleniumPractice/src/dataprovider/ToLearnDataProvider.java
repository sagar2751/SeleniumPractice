package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider 
{
	@DataProvider
	public void dataSender()
	{
		String[][] data = {{"admin","admin"}, {"user","user"}, {"sagar@gmail.com","sagar@gmail.com"}};
	}
	
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
//		driver.findElement(By.id("email")).sendKeys("sagar@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("sagar@gmail.com");
		
//		driver.findElement(By.id("email")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
	}

}
