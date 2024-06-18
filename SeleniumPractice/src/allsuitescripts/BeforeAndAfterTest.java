package allsuitescripts;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterTest 
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
	
	@Test
	public void demo()
	{
		Reporter.log("demo executed",true);
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
