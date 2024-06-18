package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDemoSkillRaryOptions 
{
	public static void main(String[] args) 
	{
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(price);
		List<WebElement> allOptions = priceSelect.getOptions();
		System.out.println(allOptions.size());
		
		for (WebElement webElement : allOptions) 
		{
			System.out.println(webElement.getText());
			
		}
		
	}

}


//O/P: 6
//Free ( 90 )
//INR 50 - INR 99 ( 1 )
//INR 100 - INR 199 ( 16 )
//INR 200 - INR 299 ( 3 )
//INR 300 - INR 399 ( 1 )
//More Than INR 500 ( 55 )
