package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//Declaration
		@FindBy(linkText = "Log in")
		private WebElement loginLink;
		
		@FindBy(linkText = "Register")
		private WebElement registerLink;
		
		//Initilization
		public WelcomePage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getLoginLink() {
			return loginLink;
		}

		public WebElement getRegisterLink() {
			return registerLink;
		}

}
