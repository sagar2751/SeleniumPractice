package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider3 
{
	@DataProvider(parallel = true)
	public String[][] dataSender()
	{
		String[][] data = {{"admin","admin"}, {"user","user"}, {"sagar@gmail.com","sagar@gmail.com"}};
		return data;
	}
	
	@Test(dataProvider = "dataSender")
	public void login(String[] cred)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		
//		driver.findElement(By.id("email")).sendKeys("admin");
//		driver.findElement(By.id("password")).sendKeys("admin");
//		
//		driver.findElement(By.id("email")).sendKeys("user");
//		driver.findElement(By.id("password")).sendKeys("user");
	}

}
