package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class LoginOHRMAdminPageObject extends CommonActions {

	public LoginOHRMAdminPageObject(WebDriver _driver) {
		super(_driver);
		
	}
	
	protected By usernameBox=By.name("username");
	protected By passwordBox=By.name("password");
	protected By loginButton=By.xpath("//button[@type='submit']");
	protected By dashboardLabel=By.xpath("//h6[text()='Dashboard']");
	
	
	protected By adminTabLeftPanel=By.xpath("//a[contains(@href,'admin')]");
	protected By sourceLabelUsername=By.xpath("//label[text()='Username']");
	protected By destinationUsernameBox=By.xpath("//input[@class='oxd-input oxd-input--active']");
	
	protected By sourceLabelUserRole=By.xpath("//label[text()='User Role']");
	protected By destinationUserRoleArrow=By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
	
	protected By dropDownValue(String value)
	{
		return By.xpath("//div[@role='option']//span[text()='"+value+"']");
	}
	
	protected By searchButton=By.xpath("//button[@type='submit']");
	protected By labelrecordFound=By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span[@class='oxd-text oxd-text--span']");
	
	

}
