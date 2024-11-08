package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageActions.DemoQAWindowHandlingPageAction;
import testRunnerPack.BaseClass;

public class DemoQAWindowHandlingStepDefinition {
	
	DemoQAWindowHandlingPageAction dwindow=new DemoQAWindowHandlingPageAction(BaseClass.getDriver());
	
	//the title of the child window is
	@Then("^the title of the child window is \"(.*)\"$")
	
	public void thetitleofthechildwindowis(String title) throws Throwable
	{
		dwindow.handleNewTab(title);
	}
	
	@And("^the url of the child window is \"(.*)\"$")
	
	public void theurlofthechildwindowis(String currentURL)
	{
		dwindow.checkCurrentURL(currentURL);
	}

}
