package crossbrowsertesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingOptional 
{
	public WebDriver driver;
	@Parameters("Browser")
	@Test
	public void launch(@Optional("chrome") String browser)
	{
		
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(browser.equals("Firefox"))
		{
		   driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
	}

}
