package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		Select priceElement = new Select(price);
		priceElement.selectByIndex(0);
		priceElement.selectByIndex(1);
		priceElement.selectByIndex(2);
//		priceElement.selectByValue("99");
//		priceElement.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		WebElement firstSelectedOption = priceElement.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		//O/P: Free ( 90 )
	}

}
