package stepDefinitions;

import io.cucumber.java.en.*;
import pageActions.DemoQADragAndDropPageAction;
import testRunnerPack.BaseClass;

public class DemoQADragAndDropStepDefinition {
	
	DemoQADragAndDropPageAction dragAndDrop=new DemoQADragAndDropPageAction(BaseClass.getDriver());
	
	@When("^I drag \"(.*)\" and drop \"(.*)\" the elements $")
	
	public void idraganddroptheelements(String dragRef, String dropRef) throws Throwable
	{
		dragAndDrop.DragAndDropElementsOnWebPage(dragRef,dropRef);
	}
	
	

}
