package cucumbertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = "Features",
		glue= {"stepdefinition"},
		tags= "(@SmokeTest or @RegressionTest)	and (not @E2ETest)"	
		)

public class TestRunner {

}


/*

		(
		features = "Features",
		glue= {"stepdefinition"},
		tags= "@SmokeTest  and  @RegressionTest"		-- AND tests tagged with both
		tags= "@SmokeTest  or  @RegressionTest"	    -- OR tests tagged with any one of the tags
		tags= "not @E2ETest"	 -- not  tagged with that tag
		)
*/