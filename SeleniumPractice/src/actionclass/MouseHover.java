package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computerElement = driver.findElement(By.partialLinkText("COMPUTERS"));
		Actions ac = new Actions(driver);
		ac.moveToElement(computerElement).perform();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Desktops")).click();
	}

}
