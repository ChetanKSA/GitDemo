package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/secondProgram.feature", glue="stepDefinition", monochrome=true, tags="@smoke or @Regression", plugin = {"pretty", "html:target/cucumber.html","json:target/cucmber.json"})
//we can use like this tags = "@smoke or @Regerssion"
// we can use like this tags="not @Regression"  --> if u dont want regression to run
public class Testrunner extends AbstractTestNGCucumberTests {
	
	

} 
