package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTheRadioButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		if (maleRadioButton.isSelected()) 
		{
			System.out.println("By default Male Radio Button is selected");
		}
		else
		{
			maleRadioButton.click();
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
