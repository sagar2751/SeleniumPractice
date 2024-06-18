package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodsUsingDismiss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
//		WebElement dismissButton = driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]"));
//		dismissButton.click();  //it will not handle the exception
		
//		WebElement dismissButton = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
//		dismissButton.click();
//		Thread.sleep(2000);  // working as per the given instruction
		
		 WebElement dismissButton = driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]/..//input[@data-action-type='DISMISS']"));
         dismissButton.click();
         Thread.sleep(2000);   // working as per the given instruction
		
		WebElement customerServiceLink = driver.findElement(By.xpath("//div/a[text()='Customer Service']"));
		customerServiceLink.click();  // working as per the instruction
		
	}

}
