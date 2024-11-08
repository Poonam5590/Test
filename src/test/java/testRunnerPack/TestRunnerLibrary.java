package testRunnerPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"src/test/resources/FeatureFileFolder/LoginOHRMAdminScenario.feature"},
		glue= {"stepDefinitions"},
		//tags="@validLogin or InvalidLogin",
		
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		,monochrome = true
		)

public class TestRunnerLibrary {

}
