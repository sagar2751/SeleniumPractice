package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);  //[890CD63990497182E92D13ECA878EE41, C4177AECCBC931BCEEEC86EB19A1BF32] address for getWindowHandles()
		for (String wid : allWids) 
		{
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widUrl);  // [29960558699A251E53626C49E16D714A, B43EF0B2AA3ACD8181926E6DB0B6E285] https://www.facebook.com/ https://www.flipkart.com/
			if (widUrl.equals("https://www.facebook.com/")) 
			{
				
			}
			else if (widUrl.equals("https://www.flipkart.com/")) 
			{
				String flipkartHomepage = driver.getTitle();
				System.out.println("flipkartHomepage = " + flipkartHomepage); // flipkartHomepage = Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers! got output
			}
		}
	}

}
