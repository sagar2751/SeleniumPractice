package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheElementByUsingLinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement forgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPasswordLink.click(); // After writing this instruction the forgotten password link got clicked
		
		WebElement createNewAccountLink = driver.findElement(By.linkText("Create new account"));
		createNewAccountLink.click(); // After clicking on create account link it navigated to create account page
		
		WebElement marketPlaceLink = driver.findElement(By.linkText("Marketplace"));
		marketPlaceLink.click(); //Afetr mentioning this it navigated to marketplace
		
		WebElement forgottenPasswordLink1 = driver.findElement(By.partialLinkText("Forgotten pass"));
		forgottenPasswordLink1.click(); // After mentioning this it clicked on forgotten password?
		
		WebElement kannadaLink = driver.findElement(By.linkText("ಕನ್ನಡ"));
		kannadaLink.click();
		Thread.sleep(2000); // by doing this page changed to kannada language
		
		WebElement englishLink = driver.findElement(By.partialLinkText("English"));
		englishLink.click();
		Thread.sleep(2000); // by doing this it again changed back to english language
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
