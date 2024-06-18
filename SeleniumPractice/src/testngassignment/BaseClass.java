package testngassignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public WebDriver driver;
	FileInputStream fis;
	Properties prop;
	HomePage hp;
	
	@Parameters("Browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome") String browser) throws IOException
	{
		fis = new FileInputStream("./testdata/commondata1.properties");
		prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
		   driver = new FirefoxDriver();
		}
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		fis = new FileInputStream("./testdata/commondata1.properties");
		prop.load(fis);
		String Email = prop.getProperty("email");
		String Password = prop.getProperty("password");
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(Email);
		lp.getPasswordTextField().sendKeys(Password);
		lp.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout()
	{
		hp = new HomePage(driver);
		hp.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
