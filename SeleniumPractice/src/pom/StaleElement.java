package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement 
{
	public static void main(String[] args) 
	{
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.get("https://demowebshop.tricentis.com/");
		 WelcomePage1 wp1 =new WelcomePage1(driver);
		 wp1.getSearchTextField().sendKeys("Mobiles",Keys.ENTER);
		 wp1.getSearchTextField().sendKeys("selenium");
		 
		 
		 // in this below line we will not get any exception because we did not refer any old reference so....
//		 driver.findElement(By.id("small-searchterms")).sendKeys("mobile",Keys.ENTER);
//		 driver.findElement(By.id("small-searchterms")).sendKeys("Selenium",Keys.ENTER);
//		 WebElement searchField = driver.findElement(By.id("small-searchterms"));
//		 searchField.sendKeys("mobile",Keys.ENTER);
//		 // it will enter the data and after get that page it will refresh it so that next term will be not enter
//		 searchField.sendKeys("Selenium");//StaleElementReferenceException
		
	}

}
