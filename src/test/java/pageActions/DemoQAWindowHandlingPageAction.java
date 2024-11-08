package pageActions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.DemoQAWindowHandlingPageObject;

public class DemoQAWindowHandlingPageAction extends DemoQAWindowHandlingPageObject {

	public DemoQAWindowHandlingPageAction(WebDriver _driver) {
		super(_driver);
		
	}
	
	public void handleNewTab(String childwindowtitle) throws Throwable
	{
		scrollTillElement(newTabButton);
		Thread.sleep(1000);
		clickElement(newTabButton);
		Thread.sleep(1000);
		handleWindowAndGetChildWindow(childwindowtitle);
	}
	
	public void checkCurrentURL(String currentURL)
	{
		Assert.assertEquals(getURLOfCurrentTab(), currentURL);
	}

}
