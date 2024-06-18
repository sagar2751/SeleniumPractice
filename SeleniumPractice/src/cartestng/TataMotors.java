package cartestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotors 
{
	@Test(groups = "system")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://cars.tatamotors.com/");
		driver.manage().window().maximize();
		Reporter.log("tata motors launched",true);
	}

}
