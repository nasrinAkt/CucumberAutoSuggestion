package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/resources/autoFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition")//tags = {""})

public class RunnerClass extends AbstractTestNGCucumberTests {

}
