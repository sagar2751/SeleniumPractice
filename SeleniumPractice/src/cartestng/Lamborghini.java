package cartestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborghini 
{
	@Test(groups = "smoke")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		driver.manage().window().maximize();
		Reporter.log("lamborghini launched",true);
	}

}
