package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForWindowScrolling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("history.go()");
		js.executeScript("window.scrollTo(0,300)");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		//js.executeScript("window.scrollBy(0,-500)"); // backward traversing y-axis 500
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		Thread.sleep(3000);
	}

}
