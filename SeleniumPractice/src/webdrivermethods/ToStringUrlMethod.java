package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToStringUrlMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://pashionfootwear.com/"); // main page
		Thread.sleep(2000);
		driver.navigate().to("https://pashionfootwear.com/collections/accessories");  // accessories page
		Thread.sleep(2000);
		driver.navigate().to("https://pashionfootwear.com/pages/wedding");  // wedding page
		Thread.sleep(2000);
		driver.navigate().forward();  //customizer
		Thread.sleep(2000);
		driver.navigate().back();  //wedding
		Thread.sleep(2000);
		driver.navigate().to("https://pashionfootwear.com/pages/customizer");  // customizer page
		Thread.sleep(2000);
		driver.navigate().to("https://pashionfootwear.com/pages/how-pashions-work");  // how-pashion-work-page
		Thread.sleep(2000);
		driver.navigate().refresh();  // it will refresh the present page
	}

}
