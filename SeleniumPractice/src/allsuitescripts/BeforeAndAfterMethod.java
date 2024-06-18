package allsuitescripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod 
{
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("before suite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("before test",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before method",true);
	}
	
	@Test
	public void demo()
	{
		Reporter.log("demo executed",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("after method",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after test",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("after suite",true);
	}

}
