package allsuitescripts;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAndAfterSuite 
{
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("before suite",true);
	}
	
	@Test
	public void demo()
	{
		Reporter.log("demo executed",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("after suite",true);
	}

}
