package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloAccountLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		
		WebElement loginLink = driver.findElement(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));
		loginLink.click();
		Thread.sleep(2000);
		
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.sendKeys("sagarmurthy2751@outlook.com");
		Thread.sleep(2000);
		
		WebElement continueButton = driver.findElement(By.id("login-submit"));
		continueButton.click();
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("Ketana@1992*");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement createBoard = driver.findElement(By.xpath("//li[@data-testid='create-board-tile']"));
		createBoard.click();
		Thread.sleep(2000);
		
		WebElement createBoardTitle = driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		createBoardTitle.sendKeys("Good Batch");
		Thread.sleep(2000);
		
		WebElement createButton = driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
		Thread.sleep(2000);
		
		if (createButton.isEnabled()) 
		{
			createButton.click();
			Thread.sleep(2000);
		} 
		
		else 
		{
			System.out.println("The create button is not enabled and the page should close");
		}
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
