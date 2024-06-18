package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelectOption = new Select(yearDropDown);
		List<WebElement> allOptions = yearSelectOption.getOptions();
		System.out.println(allOptions.size());
		yearSelectOption.selectByIndex(allOptions.size()-1);
		
	}

}
