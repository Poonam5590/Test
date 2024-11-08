package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.DemoQAListOfWebElementsPageObject;

public class DemoQAListOfWebElementsPageAction extends DemoQAListOfWebElementsPageObject {

	public DemoQAListOfWebElementsPageAction(WebDriver _driver) {
		super(_driver);


	}
	
	public void countOfButtonSize(String size) throws Throwable
	{
		getListOfWebElementsWithTotalCount(countOfButtons, size);
	}

}
