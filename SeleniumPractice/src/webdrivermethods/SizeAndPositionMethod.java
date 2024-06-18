package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndPositionMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);   // [9E0658D85144084725A98A87B4D3DC08, 4A79E62F40030AB43F2DA96305DCCA75] window id's are created
		
		for (String wid : allWids) 
		{
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println("widUrl = " + widUrl); // [7E29FEADE38B00CE9B630F1139BB7D34, 4C5E6C00DCAC77298FB4DE8842A6E739] widUrl = https://www.flipkart.com/ widUrl = https://www.facebook.com/
			
			if (widUrl.equals("https://www.flipkart.com/")) 
			{
				String widTitle = driver.getTitle();
				System.out.println("widTitle = " + widTitle); // widTitle = Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers! we will get Title for parent class
			}
			else if (widUrl.equals("https://www.facebook.com/")) 
			{
				String widTitle = driver.getTitle();
				System.out.println("widTitle = " + widTitle);
				
				int childWindowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("childWindowHeight = " + childWindowHeight); // widTitle = Facebook – log in or sign up childWindowHeight = 832
				
				int childWindowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("childWindowWidth = " + childWindowWidth); // widTitle = Facebook – log in or sign up childWindowWidth = 1552
				
				int childWindowXAxis = driver.manage().window().getPosition().getX();
				System.out.println("childWindowXAxis = " + childWindowXAxis);  // widTitle = Facebook – log in or sign up childWindowXAxis = -8
				
				int childWindowYAxis = driver.manage().window().getPosition().getY();
				System.out.println("childWindowYAxis = " + childWindowYAxis);  // widTitle = Facebook – log in or sign up childWindowYAxis = -8
				
				Dimension definedSize = new Dimension(1000,500);
				driver.manage().window().setSize(definedSize);  // this has to be written inside the child type and if we write for the parent type both the pages will be settled for the dimension which we rae specifying
				Thread.sleep(3000);
				
				Point definedPosition = new Point(200, 300);
				driver.manage().window().setPosition(definedPosition);
				
			}
		}
	}

}
