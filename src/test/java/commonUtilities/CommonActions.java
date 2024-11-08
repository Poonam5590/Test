package commonUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class CommonActions extends commonMethods{

	public CommonActions(WebDriver _driver) {
		super(_driver);
		
	}
	
	
	public void launchBrowserAndURL(String choice, String URL)
	{
		if(choice.equalsIgnoreCase("chrome"))
		{
			ChromeOptions opt=new ChromeOptions();
			 opt.addArguments("start-maximized");
			 driver=new ChromeDriver(opt);			
		}
		else if(choice.equalsIgnoreCase("edge"))
		{
			EdgeOptions edgeopt=new EdgeOptions();
			 edgeopt.addArguments("start-maximized");
			 driver=new EdgeDriver(edgeopt);
		}
		 		 
		 driver.navigate().to(URL);
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void clickElement(By reference) throws Throwable
	{
		element=createUIelement(reference);
		//scrollTillElement(reference);
		click();
		Thread.sleep(1000);
	}
	
	
	public void doubleclickElement(By reference) throws Throwable
	{
		actions=new Actions(getDriver());
		element=createUIelement(reference);
		scrollTillElement(reference);
		actions.moveToElement(element).contextClick().build().perform();
		Thread.sleep(1000);
		
	}
	
	public void rightclickElement(By reference) throws Throwable
	{
		actions=new Actions(getDriver());
		element=createUIelement(reference);
		scrollTillElement(reference);
		actions.moveToElement(element).contextClick().build().perform();
		Thread.sleep(1000);
		
	}
	
	
	public void uploadFileOnUI(String filenamewithpath) throws Exception
	{
		Robot rb=new Robot();
		  
		  StringSelection str=new StringSelection(filenamewithpath);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		  
		  //press ctr+v for pasting
		  rb.keyPress(KeyEvent.VK_CONTROL);
		  rb.keyPress(KeyEvent.VK_V);
		  
		  //release ctr+v for pasting
		  rb.keyRelease(KeyEvent.VK_CONTROL);
		  rb.keyRelease(KeyEvent.VK_V);
		  
		  //for pressing and releasing enter
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyPress(KeyEvent.VK_ENTER);
		  
	}
	
	public void handleWindowAndGetChildWindow(String childwindowHeading) throws Throwable
	{
		//get handles of window
		String mainWindowHandle=super.getWindowHandle();
		Set<String> allWindowHandles=super.getWindowHandles();
	   Iterator<String>	iterator=allWindowHandles.iterator();
	   
	   //here we will check if child window has other child window and will fetch the heading of the child window
	   
	   while(iterator.hasNext())
	   {
		  String ChildWindow=iterator.next();
		  if(!mainWindowHandle.equalsIgnoreCase(ChildWindow))
		  {
			  super.switchTo().window(ChildWindow);
			  System.out.println("Title of child window is " + getTitleOfCurrentTab());
			  ExtentCucumberAdapter.addTestStepLog("Title of child window is " + getTitleOfCurrentTab());
			  Assert.assertEquals(childwindowHeading, getTitleOfCurrentTab());
		  }
		   
	   }
	}
	
	
	public void compareTextValueOfElementWithValueOnUI(By reference, String expectedValue) throws Throwable
	{
	
		Assert.assertEquals(expectedValue, getTextOfElement(reference));
	}
	
	public boolean checkIfElementDisplayOnUI(By reference) throws Throwable
	{
		boolean output=checkIfElementDisplayed(reference);
		return output;
	}
	
	
	public boolean checkIfElementnotDisplayOnUI(By reference) throws Throwable
	{
		boolean output=checkIfElementDisplayed(reference);
		return output;
	}

	public void switchToFrame(By reference) throws Throwable
	{
		element=createUIelement(reference);
		super.switchTo().frame(element);
		
	}
	
	public void switchOutOfFrame()
	{
		super.switchTo().defaultContent();
	}
	
	public String getTextOfElement(By reference) throws Throwable
	{
		element=createUIelement(reference);
		return super.getText();
	}
	
	public String getTitleOfCurrentTab()
	{
		return super.getTitle();
	}

	public String getURLOfCurrentTab()
	{
		return super.getCurrentUrl();
	}
	
	public void getListOfWebElementsWithTotalCount(By reference, String size) throws Throwable
	{
		multipleElements=createUIelements(reference);
		ExtentCucumberAdapter.addTestStepLog("count of element is "+multipleElements.size());
		int expectedsize=Integer.parseInt(size);
		Assert.assertEquals(expectedsize, multipleElements.size());
	}
	
	
	public void dragAndDropElement(By dragReference,By dropReference) throws Throwable
	{
		actions=new Actions(getDriver());
		dragelement=createUIelement(dragReference);
		dropelement=createUIelement(dropReference);
		scrollTillElement(dragReference);
		actions.dragAndDrop(dragelement, dropelement).build().perform();
		Thread.sleep(1000);
		
	}
	
	public void acceptAlert()
	{
		super.switchTo().alert();
		super.accept();
	}
	
	public void dismissAlert()
	{
		super.switchTo().alert();
		super.dismiss();
	}
	
	public void enterDataInAlertAndAccept(String data)
	{
		super.switchTo().alert();
		super.sendKeys(data);
		super.accept();
	}
	
	
	public void enterDataInAlertAndDismiss(String data)
	{
		super.switchTo().alert();
		super.sendKeys(data);
		super.dismiss();
	}
	
	public void enterDataInElement(By reference, CharSequence... data) throws Throwable
	{
		//scrollTillElement(reference);
		element=createUIelement(reference);
		super.sendKeys(data);
		Thread.sleep(1000);
	}
	
	public void scrollTillElement(By reference) throws Throwable
	{
		
		JavascriptExecutor js=(JavascriptExecutor) getDriver();
		element=createUIelement(reference);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(1000);
		
	}
	
	public void selectDropDownValueUsing(By reference,String choice, int index, String value, String visibleText) throws Throwable
	{
		element=createUIelement(reference);
		select =new Select(element);
		
		switch(choice)
		{
		  case "index":{select.selectByIndex(index);}
		  
		  break;
		  
		  case "value": {select.selectByValue(value);}
		  break;
		  
		  case "visibletext": {	select.selectByVisibleText(visibleText);}
		  break;
		  
		  default:
			  throw new IllegalAccessException("unexpected value"+choice);
		
		}
		
	}
	
	public boolean checkIfElementDisplayed(By reference) throws Throwable
	{
		element=createUIelement(reference);
		boolean val=false;
		
		try {
			if(super.isDisplayed())
			{
				val=true;
			}
			else
			{
				val=false;
			}
			
		}
		catch(Exception e){
			System.out.println("element is not displayed");
			
		}
		return val;
		
	}
	
	public  boolean checkIfElementChecked(By reference) throws Throwable
	{
		element=createUIelement(reference);
		boolean val=false;
		
		try {
			if(super.isSelected())
			{
				val=true;
			}
			else
			{
				val=false;
			}
			
		}
		catch(Exception e){
			System.out.println("element is not selected");
			
		}
		return val;
		
	}
	
	public By createLocatorBelow(By source, By destination)
	{
		 By locator= RelativeLocator.with(destination).below(source);
		 return locator;
	}
	
	public By createLocatorAbove(By source, By destination)
	{
		 By locator= RelativeLocator.with(destination).above(source);
		 return locator;
	}
	
	public By createLocatorToRightOf(By source, By destination)
	{
		 By locator= RelativeLocator.with(destination).toRightOf(source);
		 return locator;
	}
	
	public By createLocatorLeftOf(By source, By destination)
	{
		 By locator= RelativeLocator.with(destination).toLeftOf(source);
		 return locator;
	}
	
	public By createLocatorNear(By source, By destination)
	{
		 By locator= RelativeLocator.with(destination).near(source);
		 return locator;
	}
	
	
	
	
	
	
	
}
 