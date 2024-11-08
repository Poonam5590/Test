package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeTest;

import commonUtilities.CommonActions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testRunnerPack.BaseClass;

public class Hooks {
	
	CommonActions ca=new CommonActions(BaseClass.getDriver());
	
	@Before
	public void navigateToApp()
	{
		//ca.launchBrowserAndURL("CHROME", "https://demoqa.com/buttons");
	}
	
	@After
	public void quitBrowser()
	{
		//ca.quitBrowser();
	}
	
	@AfterStep
	public void takeScreenshotOfUI(Scenario scenario)
	{
		TakesScreenshot ts=(TakesScreenshot) BaseClass.getDriver();
		
		byte[] src=ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", returnCurrentTimeStamp()+".png");
	}
	
	public static String returnCurrentTimeStamp()
	{
		SimpleDateFormat date=new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		String timeStamp=date.format(new Date());
		String value1=timeStamp.replaceAll(":", "");
		String value2=value1.replaceAll(" ", "");
		System.out.println(value2);
		return value2;
	}
	

}
