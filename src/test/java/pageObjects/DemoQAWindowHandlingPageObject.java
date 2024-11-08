package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class DemoQAWindowHandlingPageObject  extends CommonActions{

	public DemoQAWindowHandlingPageObject(WebDriver _driver) {
		super(_driver);
		
	}
	
	protected By newTabButton=By.id("tabButton");

}
