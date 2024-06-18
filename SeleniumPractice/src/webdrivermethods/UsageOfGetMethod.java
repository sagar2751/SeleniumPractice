package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethod 
{
	public static void main(String[] args) 
	{
		 //ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//org.openqa.selenium.InvalidArgumentException: invalid argument (Selenium Exception)
		
		//driver.get("flipkart.com/"); // if their is no protocol and domainname mentioned we will get this error during runtime and it is unchecked exception
		
		driver.get("https://www.flipkart.com/");
	}

}
