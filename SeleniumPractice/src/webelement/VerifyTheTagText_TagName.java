package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTagText_TagName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgottenPasswordLink = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?privacy')]"));
		String forgottenPasswordLinkText = forgottenPasswordLink.getText();
		System.out.println("forgottenPasswordLinkText = " + forgottenPasswordLinkText);  
		//O/P: forgottenPasswordLinkText = Forgotten password?
		String forgottenPasswordLinkTagName = forgottenPasswordLink.getTagName();
		System.out.println("forgottenPasswordLinkTagName = " + forgottenPasswordLinkTagName);  
		// O/P: forgottenPasswordLinkTagName = a
		if (forgottenPasswordLinkTagName.equals(forgottenPasswordLinkTagName)) 
		{
			forgottenPasswordLink.click();
			Thread.sleep(2000);
		} 
		else 
		{
			System.out.println("This is not a link");
		}
		driver.quit();
	}

}
