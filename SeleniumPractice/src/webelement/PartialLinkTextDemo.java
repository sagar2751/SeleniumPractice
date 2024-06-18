package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		Thread.sleep(2000);
		WebElement rpfUploadLink = driver.findElement(By.partialLinkText("Link for RFP uploaded on CBC website for Printing Publishing PIB handbook General Elections 2024"));
		rpfUploadLink.click();
		Thread.sleep(2000);
		/*driver.manage().window().minimize();
		Thread.sleep(2000);*/
		driver.quit();
	}

}
