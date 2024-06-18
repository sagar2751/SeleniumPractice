package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreCondAndPostCond 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
	}

}
