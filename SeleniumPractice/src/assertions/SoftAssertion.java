package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "login page is not displayed");
		Reporter.log("home page is displayed");
		
		driver.findElement(By.id("Email")).sendKeys("sagarmurthy92@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Snapo@2751");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		softassert.assertEquals(driver.getTitle(), "Demo Web Shop", "home page is not displayed");
		Reporter.log("home page is displayed");
		softassert.assertAll();
	
	}

}
