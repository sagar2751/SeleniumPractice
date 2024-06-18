package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToURL_Url 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		
		URL mainURL = new URL("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		
		URL spacePage = new URL(mainURL, "space/");
		driver.navigate().to(spacePage);
		Thread.sleep(2000);
		
	}

}
