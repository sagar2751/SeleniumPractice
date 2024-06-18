package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream fis = new FileInputStream("./testdata/TestScriptData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String url = workbook.getSheet("Registration").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(url);
		
		String email = workbook.getSheet("Registration").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(email);
		
		String password = workbook.getSheet("Registration").getRow(1).getCell(2).getStringCellValue();
		//System.out.println(password);
		
		String confirmpassword = workbook.getSheet("Registration").getRow(1).getCell(3).getStringCellValue();
		//System.out.println(confirmpassword);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		WebElement loginLink = driver.findElement(By.xpath("//a[text()='Log in']"));
		loginLink.click();
		
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.click();
		emailTextField.sendKeys(email);
		
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		passwordTextField.click();
		passwordTextField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
	}


}
