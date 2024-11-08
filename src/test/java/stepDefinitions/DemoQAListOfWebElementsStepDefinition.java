package stepDefinitions;

import io.cucumber.java.en.Then;
import pageActions.DemoQAListOfWebElementsPageAction;
import testRunnerPack.BaseClass;

public class DemoQAListOfWebElementsStepDefinition {
	
	DemoQAListOfWebElementsPageAction dlist=new DemoQAListOfWebElementsPageAction(BaseClass.getDriver());
	
	//the total count of buttons is
	@Then("^the total count of buttons is  \"(.*)\"$")
	public void thetotalcountofbuttonsis(String count) throws Throwable
	{
		dlist.countOfButtonSize(count);
	}
	
	

}
