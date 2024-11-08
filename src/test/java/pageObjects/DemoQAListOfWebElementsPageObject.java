package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class DemoQAListOfWebElementsPageObject extends CommonActions{

	public DemoQAListOfWebElementsPageObject(WebDriver _driver) {
		super(_driver);
		
	}
	
	protected By countOfButtons=By.xpath("//button[@type='button' and @class='btn btn-primary']");

}
