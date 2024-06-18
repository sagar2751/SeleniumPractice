package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitWrongUsageMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop-global.malaicha.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).submit();
		Thread.sleep(2000);     // O/P: java.lang.UnsupportedOperationException
		
		//Usage of submit(), without<form> tag or <input> tag or without type = 'submit' or type='button'
		//submit() will fail in this case
	}

}
