package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/ceroshjacob/eclipse-workspace/BDDFramework/src/main/java/Features/Contacts.feature"
		,glue= {"stepDefenitions"},	
		format = {"pretty", "html:test-output"},
		dryRun= false,
		monochrome = true
		)

public class TestRunner {

}
