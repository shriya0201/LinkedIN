package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



 
//@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
					glue="StepDefinitions",
					plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					dryRun = true)
public class NewTest extends AbstractTestNGCucumberTests {

}

