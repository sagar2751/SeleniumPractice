package cartestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ford 
{
	@Test(groups = {"system", "integration"})
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ford.com/");
		driver.manage().window().maximize();
		Reporter.log("ford launcehd",true);
	}

}
