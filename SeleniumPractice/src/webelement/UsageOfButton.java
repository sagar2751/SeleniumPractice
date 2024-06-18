package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfButton 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*WebElement loginButton = driver.findElement(By.id("u_0_9_8e"));
		it is not working because id is dynamic in nature so that it was not working.
		we go id when the id will be static in nature at that time we use id.
		we did not when we have no id and id is present but value is not present and id is dynamic.
		when we did not use id at that time the second priotity is the name.*/
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
