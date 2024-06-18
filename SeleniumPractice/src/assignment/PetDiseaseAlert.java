package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDiseaseAlert 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement mapLink = driver.findElement(By.xpath("//iframe[contains(@src,'https://api-prod.capcvet.org/api/embed/pda/t7xbkxksJgAaEv2c2Polxl1Df3wYva26qaX7WKmt?iframe=1&widget=1&links=0')]"));
		driver.switchTo().frame(mapLink);
		driver.findElement(By.id("region-35")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		WebElement messageAlert = driver.findElement(By.xpath("//h1[text()='Step 1: Sign Up for Customized Alerts']"));
		System.out.println(messageAlert.getText());
	}

}
