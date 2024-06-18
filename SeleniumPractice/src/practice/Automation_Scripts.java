package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Scripts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myvi.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.airtel.in/prepaid-4g-sim/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.jio.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.bsnl.co.in/");
		Thread.sleep(2000);
		
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		for (String wid : allWids) 
		{
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widUrl);
		}
	}

}
