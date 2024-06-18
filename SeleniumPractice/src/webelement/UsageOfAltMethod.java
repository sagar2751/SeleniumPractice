package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfAltMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement flipkartAltImage = driver.findElement(By.xpath("//img[@alt='Travel']"));
		String flipkartAttributAlt = flipkartAltImage.getAttribute("alt");
		System.out.println("flipkartAttributAlt =" + flipkartAttributAlt);   //O/P; flipkartAttributAlt =Travel
		
	}

}
