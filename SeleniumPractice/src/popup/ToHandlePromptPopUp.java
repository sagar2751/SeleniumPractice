package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryItButton.click();
		Thread.sleep(2000);
		
		Alert promptPopUp = driver.switchTo().alert();
		promptPopUp.sendKeys("selenium");
		promptPopUp.accept();
		
		driver.quit();
		
	}

}
