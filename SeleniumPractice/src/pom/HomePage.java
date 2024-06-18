package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	    //Declaration
		@FindBy(linkText = "Log out")
		private WebElement logoutLink;
		
		//Initialization
		public HomePage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		
		//Provide getters
		public WebElement getLogoutLink() 
		{
			return logoutLink;
		}

}
