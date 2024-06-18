package practice;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowBySettingPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		
		
		driver.get("https://www.amway.in/");
		Thread.sleep(2000);
		
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		
		for (String wid : allWids) 
		{
			String widTitle = driver.switchTo().window(wid).getTitle();
			System.out.println(widTitle);
			
			if (widTitle.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra")) 
			{
				System.out.println("Myntra Page");
			}
			
			else if (widTitle.equals("Amway India: Complete Range of Health and Beauty Products Online")) 
			{
				String widURL = driver.switchTo().window(wid).getCurrentUrl();
				System.out.println(widURL);
				
				int childWindowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("childWindowHeight = " + childWindowHeight);
				
				int childWindowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("childWindowWidth = " + childWindowWidth);
				
				int childWindowXAxis = driver.manage().window().getPosition().getX();
				System.out.println("childWindowXAxis = " + childWindowXAxis);
				
				int childWindowYAxis = driver.manage().window().getPosition().getY();
				System.out.println("childWindowYAxis = " + childWindowYAxis);
				Thread.sleep(2000);
				
				Dimension sizeOfWindow = new Dimension(500, 600);
				driver.manage().window().setSize(sizeOfWindow);
				
				Point positionOfWindow = new Point(100, 200);
				driver.manage().window().setPosition(positionOfWindow);
			}
		}
		
	}

}
