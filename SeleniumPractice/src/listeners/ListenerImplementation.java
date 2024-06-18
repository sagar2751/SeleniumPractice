package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener, ISuiteListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getName();
		Reporter.log("Testscript is failed",true);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshots/"+methodName+".png");
		try 
		{
			FileUtils.copyFile(temp, perm);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	

}
