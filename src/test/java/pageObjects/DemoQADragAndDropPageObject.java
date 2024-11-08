package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonActions;

public class DemoQADragAndDropPageObject extends CommonActions {
	
	public DemoQADragAndDropPageObject(WebDriver _driver) {
		super(_driver);
		
	}
	
	protected By dragAndDropReference(String ref)
	{
		return By.xpath("//div[@id='simpleDropContainer']//div[@id='"+ref+"']");
	}
	
	//protected By  dragreference=By.xpath("//div[@id='simpleDropContainer']//div[@id='draggable']");
	//protected By dropreference=By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']");
	
	

}
