package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue={"StepDef", "/src/test/resources/Utlities"}, 
		monochrome = true, 
		plugin = { "pretty", "html:target/HtmlReports/"},
		dryRun= false
		
		)

public class FeatureFileRunner {

}
