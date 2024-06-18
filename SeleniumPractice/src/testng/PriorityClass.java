package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass 
{
	@Test(priority=1)
	public void sample()
	{
		Reporter.log("hello");
	}
	
	@Test(priority=-1)
	public void demo()
	{
		Reporter.log("world");
	}

}
