package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.DemoQAFormPageObject;

public class DemoQAFormPageAction  extends DemoQAFormPageObject{

	public DemoQAFormPageAction(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public void enterfirstName(String data) throws Throwable
	{

		enterDataInElement(firstName, data);
	}

	public void enterlastName(String data) throws Throwable
	{

		enterDataInElement(lastName, data);
	}
	
	public void enteremail(String data) throws Throwable
	{

		enterDataInElement(email, data);
	}
	
	public void clickmaleRadio() throws Throwable
	{
		clickElement(maleRadio);
	}
}
