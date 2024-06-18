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

public class Registration_Page 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./testdata/TestScriptData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String url = workbook.getSheet("Registration").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String email = workbook.getSheet("Registration").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		
		String password = workbook.getSheet("Registration").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		
		String confirmpassword = workbook.getSheet("Registration").getRow(1).getCell(3).getStringCellValue();
		System.out.println(confirmpassword);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		registerLink.click();
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		maleRadioButton.click();
		
		WebElement firstNameTextField = driver.findElement(By.id("FirstName"));
		firstNameTextField.click();
		firstNameTextField.sendKeys("Sagar");
		
		WebElement lastNameTextField = driver.findElement(By.id("LastName"));
		lastNameTextField.click();
		lastNameTextField.sendKeys("Murthy");
		
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.click();
		emailTextField.sendKeys(email);
		
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		passwordTextField.click();
		passwordTextField.sendKeys(password);
		
		WebElement confirmPasswordTextField = driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordTextField.click();
		confirmPasswordTextField.sendKeys(confirmpassword);
		
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
	}

}
