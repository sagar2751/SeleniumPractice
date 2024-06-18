package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSingleWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String wid = driver.getWindowHandle();  // it will get the code of particular window
		System.out.println("wid = " + wid);  // it will return String format
		
		// o/p wid = 263CBC27AFA86F08B97C33C9FE898253
	}

}
