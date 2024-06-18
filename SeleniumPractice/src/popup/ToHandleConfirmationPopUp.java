package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		Alert confirmationPopUp = driver.switchTo().alert();
		System.out.println(confirmationPopUp.getText());
		confirmationPopUp.accept();
		Thread.sleep(2000);
		confirmationPopUp.accept();
		
		driver.quit();
		
	}

}


//O/P: Do you really want to delete this Customer?