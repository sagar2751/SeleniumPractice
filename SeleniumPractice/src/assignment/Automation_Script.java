package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Script 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.snapchat.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.whatsapp.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.snapchat.com/");
		String url = driver.getCurrentUrl();
		System.out.println("url = " + url);  // O/P: URL of page: url = https://www.snapchat.com/
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		String flipkartHomepageTitle = driver.getTitle();
		System.out.println("flipkartHomepageTitle = " + flipkartHomepageTitle); // O/P: flipkartHomepageTitle = Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
		
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);  // O/P: [7C94967B02242FA2C9EB1E3F0B7716F3, EB2ADCE8A2098272D6C38006F0A0C1EF, 3791B309894316F65B10FFC9366D500B, 6C4D6600E710DF9AAF43EF6EF34AB848, CF6AA450FA4836AD4FBDB31849424D59]
		for (String wid : allWids) 
		{
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println("widUrl = " + widUrl);  // O/P: [AE73A95CE5F1C421D7F541F8177A8467, 06B4D2EAEC27DC7BE49E34B68E555A69, 1702316AD26758B5DA63DBC63BD90B08, 27E20E207F9DAFDDAC1EAADBC3D5BD46, 83C24C7C318DA57434B7A7D992AB5725]widUrl = https://www.facebook.com/ widUrl = https://www.snapchat.com/  widUrl = https://www.whatsapp.com/ widUrl = https://www.flipkart.com/ widUrl = https://www.amazon.in/
			
			if (widUrl.equals("https://www.facebook.com/")) 
			{
				
			}
			
			else if (widUrl.equals("https://www.amazon.in/")) 
			{
				String widTitle = driver.getTitle();
				System.out.println("widTitle = " + widTitle); // O/P: widTitle = Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
				
				int childWindowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("childWindowHeight = " + childWindowHeight);
				
				int childWindowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("childWindowWidth = " + childWindowWidth);
				
				int childWindowXAxis = driver.manage().window().getPosition().getX();
				System.out.println("childWindowXAxis = " + childWindowXAxis);
				
				int childWindowYAxis = driver.manage().window().getPosition().getY();
				System.out.println("childWindowYAxis = " + childWindowYAxis);  // O/P: widTitle = Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in childWindowHeight = 832 childWindowWidth = 1552 childWindowXAxis = -8 childWindowYAxis = -8
				
				Dimension definedSize = new Dimension(900,500);
				driver.manage().window().setSize(definedSize);
				Thread.sleep(2000);
				driver.manage().window().minimize();
			}
		}
		driver.quit();
	}

}
