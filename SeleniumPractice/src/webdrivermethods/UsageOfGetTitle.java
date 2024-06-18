package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String facebookLoginTitle = driver.getTitle();
		
		System.out.println("facebookLoginTitle = " + facebookLoginTitle);
		
	}

}
