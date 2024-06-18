package testngassignment;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
	@Test
	public void execution()
	{
		hp = new HomePage(driver);
		hp.getElectronicsLink().click();
		Reporter.log("script executed",true);
	}

}
