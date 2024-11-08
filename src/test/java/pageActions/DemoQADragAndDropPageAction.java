package pageActions;

import org.openqa.selenium.WebDriver;

import pageObjects.DemoQADragAndDropPageObject;

public class DemoQADragAndDropPageAction extends DemoQADragAndDropPageObject {

	public DemoQADragAndDropPageAction(WebDriver _driver) {
		super(_driver);
		
	}
	
	public void DragAndDropElementsOnWebPage(String dragRef, String dropRef ) throws Throwable
	{
		dragAndDropElement(dragAndDropReference(dragRef), dragAndDropReference(dropRef));
	}

}
