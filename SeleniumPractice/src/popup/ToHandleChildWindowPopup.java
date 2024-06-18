package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/6");
		WebElement compareButton = driver.findElement(By.id("compare"));
		compareButton.click();

		
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) 
		{
			String url = driver.switchTo().window(wid).getCurrentUrl();
//			if (url.contains("amazon")) 
//			{
//				driver.close();
//			}
//			
//			else if(url.contains("ebay"))
//			{
//				driver.manage().window().maximize();
//			}
//			
//			else if (url.contains("flipkart")) 
//			{
//				driver.close();
//			}
			
			if (!(url.contains("shoppersstack"))) 
			{
				driver.close();
			}
		}
		driver.quit();
	}

}
