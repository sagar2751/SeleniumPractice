package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage1 
{
	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;
	
	public WelcomePage1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTextField() 
	{
		return searchTextField;
	}

}
