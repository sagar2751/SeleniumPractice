package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement flipkartLink = driver.findElement(By.xpath("//a[@aria-label='Flipkart']//img"));
		String flipkartLinkToolTip = flipkartLink.getAttribute("title");
		System.out.println("flipkartLinkToolTip = " + flipkartLinkToolTip);   
		// O/P: flipkartLinkToolTip = Flipkart got the expected result as per the instructions given
		Thread.sleep(2000);
		driver.quit();
	}

}
