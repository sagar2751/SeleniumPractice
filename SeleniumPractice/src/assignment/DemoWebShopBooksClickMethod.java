package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopBooksClickMethod 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement booksElement = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]"));
		booksElement.click();
		
		WebElement sortDropDown = driver.findElement(By.id("products-orderby"));
		Select sortBySelect = new Select(sortDropDown);
		sortBySelect.selectByVisibleText("Price: High to Low");
		
		
	}

}
