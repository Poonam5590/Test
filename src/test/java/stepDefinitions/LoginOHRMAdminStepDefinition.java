package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.LoginOHRMAdminPageAction;
import testRunnerPack.BaseClass;

public class LoginOHRMAdminStepDefinition {
	
	LoginOHRMAdminPageAction login=new LoginOHRMAdminPageAction(BaseClass.getDriver());
	
	@When("^I enter username as \"(.*)\" in username field $")
	
	public void ienterusernameasinusernamefield(String username) throws Throwable
	{
		login.enterDataInusernameBox(username);
	}
	
	@And("^I enter password as \"(.*)\" in password field$")
	public void ienterpasswordasinpasswordfield(String password) throws Throwable
	{
		login.enterDataInpasswordBox(password);
	}
	
	@And("^I click the button Login$")
	public void iclickthebuttonLogin() throws Throwable
	{
		login.clickLoginButton();
	}
	
	@Then("^I can see dashboard page on successfull login$")
	public void icanseedashboardpageonsuccessfulllogin() throws Throwable
	{
		login.checkIfDashboardLabelIsDisplayedOnUI();
	}
	
	@When("^I click on admin tab in left panel$")
	public void iclickonadmintabinleftpanel() throws Throwable
	{
		login.clickadminTabLeftPanel();
	}
	
	@And("^I enter \"(.*)\" in search username field$")
	public void ienterinsearchusernamefield(String data) throws Throwable
	{
		login.enterDataInSearchUsernameField(data);
	}
	
	@And("^I select \"(.*)\"  in user role dropdown $")
	public void iselectinuserroledropdown (String data) throws Throwable
	{
		login.selectValueInDropDownUserRole(data);
	}
	
	@And("^I click on button search$")
	public void iclickonbuttonsearch() throws Throwable
	{
		login.clickSearchButton();
	}
	
	
	@Then("^I have message \"(.*)\"$")
	public void ihavemessageRecordFound(String message) throws Throwable
	{
		login.checkMessage(message);
	}
	

}
