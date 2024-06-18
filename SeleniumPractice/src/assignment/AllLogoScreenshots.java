package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLogoScreenshots 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.flipkart.com/");
		
		WebElement groceryLogo = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		File tempFile = groceryLogo.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./imgshots/" + timeStamp + "groceryLogo.png");
		FileUtils.copyFile(tempFile, permFile);
		
		
		WebElement mobileLogo = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		File tempFile1 = mobileLogo.getScreenshotAs(OutputType.FILE);
		File permFile1 = new File("./imgshots/" + timeStamp + "mobileLogo.png");
		FileUtils.copyFile(tempFile1, permFile1);
		
		
		WebElement fashionLogo = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		File tempFile2 = fashionLogo.getScreenshotAs(OutputType.FILE);
		File permFile2 = new File("./imgshots/" + timeStamp + "fashionLogo.png");
		FileUtils.copyFile(tempFile2, permFile2);
		
		WebElement electronicsLogo = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		File tempFile3 = electronicsLogo.getScreenshotAs(OutputType.FILE);
		File permFile3 = new File("./imgshots/" + timeStamp + "electronicsLogo.png");
		FileUtils.copyFile(tempFile3, permFile3);
		
		WebElement homeAndFurnitureLogo = driver.findElement(By.xpath("//img[@alt='Home & Furniture']"));
		File tempFile4 = homeAndFurnitureLogo.getScreenshotAs(OutputType.FILE);
		File permFile4 = new File("./imgshots/" + timeStamp + "homeAndFurnitureLogo.png");
		FileUtils.copyFile(tempFile4, permFile4);
		
		WebElement appliancesLogo = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		File tempFile5 = appliancesLogo.getScreenshotAs(OutputType.FILE);
		File permFile5 = new File("./imgshots/" + timeStamp + "appliancesLogo.png");
		FileUtils.copyFile(tempFile5, permFile5);
		
		WebElement travelLogo = driver.findElement(By.xpath("//img[@alt='Travel']"));
		File tempFile6 = travelLogo.getScreenshotAs(OutputType.FILE);
		File permFile6 = new File("./imgshots/" + timeStamp + "travelLogo.png");
		FileUtils.copyFile(tempFile6, permFile6);
		
		WebElement beautyToysAndMoreLogo = driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"));
		File tempFile7 = beautyToysAndMoreLogo.getScreenshotAs(OutputType.FILE);
		File permFile7 = new File("./imgshots/" + timeStamp + "beautyToysAndMoreLogo.png");
		FileUtils.copyFile(tempFile7, permFile7);
		
		WebElement twoWheelersLogo = driver.findElement(By.xpath("//img[@alt='Two Wheelers']"));
		File tempFile8 = twoWheelersLogo.getScreenshotAs(OutputType.FILE);
		File permFile8 = new File("./imgshots/" + timeStamp + "twoWheelersLogo.png");
		FileUtils.copyFile(tempFile8, permFile8);
		
		driver.quit();
	}


}
