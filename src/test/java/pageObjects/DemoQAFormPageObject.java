package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class DemoQAFormPageObject extends CommonActions {

	public DemoQAFormPageObject(WebDriver _driver) {
		super(_driver);
	}
	
	protected By firstName=By.id("firstName");
	protected By lastName=By.id("lastName");
	protected By email=By.id("userEmail");
	protected By maleRadio=By.xpath("//input[@id='gender-radio-1']//following-sibling::label");

}
