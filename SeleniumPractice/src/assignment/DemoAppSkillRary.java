package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppSkillRary 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		WebElement addIcon = driver.findElement(By.id("add"));
		Actions ac = new Actions(driver);
		ac.moveToElement(addIcon).doubleClick(addIcon).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./demoappskillrary/seleniumpagescreenshot.png");
		FileUtils.copyFile(tempFile, permFile);
		
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
