 package stepDefinitions;

import pageActions.DemoQAFormPageAction;
import testRunnerPack.BaseClass;
import io.cucumber.java.en.*;

public class DemoQAFormStepDefinition {
	
	DemoQAFormPageAction dpa=new DemoQAFormPageAction(BaseClass.getDriver());
	
	
	
	@Given("^I launch browser \"(.*)\" and navigate to the page having url \"(.*)\"$")
	
	public void ilaunchbrowserandnavigatetothepagehavingurl(String browserchoice,String url ) 
	{
		
		dpa.launchBrowserAndURL(browserchoice, url);
		
	}
	
	//I enter the first name value as ""
	
	@When("^I enter the first name value as \"(.*)\"$")
	
	public void ienterthefirstnamevalueas(String firstname) throws Throwable
	{
		dpa.enterfirstName(firstname);
	}
	
	@And("^I enter the last name value as \"(.*)\"$")
	
	public void ienterthelastnamevalueas(String lastname) throws Throwable
	{
		dpa.enterlastName(lastname);
	}

	@And("^I enter the email address as \"(.*)\"$")

	public void ientertheemailaddressas(String mailaddress) throws Throwable
	{
		dpa.enteremail(mailaddress);
	}
	
	@And("^I select 'male' radio button$")
	
	public void iselectmaleradiobutton() throws Throwable
	{
		dpa.clickmaleRadio();
	}
	
	

}
