package pageActions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginOHRMAdminPageObject;

public class LoginOHRMAdminPageAction extends LoginOHRMAdminPageObject {

	public LoginOHRMAdminPageAction(WebDriver _driver) {
		super(_driver);

	}
	
	public void enterDataInusernameBox(String data) throws Throwable
	{
		enterDataInElement(usernameBox, data);
	}
	
	public void enterDataInpasswordBox(String data) throws Throwable
	{
		enterDataInElement(passwordBox, data);
	}
	
	public void clickLoginButton() throws Throwable
	{
		clickElement(loginButton);
	}
	
	public void checkIfDashboardLabelIsDisplayedOnUI() throws Throwable
	{
		boolean value=checkIfElementDisplayOnUI(dashboardLabel);
		Assert.assertEquals(true, value);
		
	}
	
	public void clickadminTabLeftPanel() throws Throwable
	{
		clickElement(adminTabLeftPanel);
	}
	
	public void enterDataInSearchUsernameField(String data) throws Throwable
	{
		//createLocatorBelow
		enterDataInElement(createLocatorBelow(sourceLabelUsername, destinationUsernameBox), data);
	}
	
	
	public void selectValueInDropDownUserRole(String data) throws Throwable
	{
		clickElement(createLocatorBelow(sourceLabelUserRole, destinationUserRoleArrow));
		clickElement(dropDownValue(data));
	}
	
	public void clickSearchButton() throws Throwable
	{
		clickElement(searchButton);
	}
	
	public void checkMessage(String message) throws Throwable
	{
		scrollTillElement(labelrecordFound);
		compareTextValueOfElementWithValueOnUI(labelrecordFound, message);
	}
	

}
