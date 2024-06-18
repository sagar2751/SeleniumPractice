package webelement;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RCBScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.royalchallengers.com/");
		WebElement rcbLogo = driver.findElement(By.xpath("//div[@class='hdr-logo']//img"));
		File tempFile = rcbLogo.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./defectsshot/rcbLogo.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.quit();
	}

}
