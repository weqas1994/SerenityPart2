package runnerPackage;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Steps;
import stepDefinition.Stepdef;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue="stepDefinition",
		features="src\\test\\resources\\Features\\firstFeature.feature",
		dryRun=false,
		tags="@tag1",
		plugin = { "pretty",
				"html:target/cucumber", 
				"json:target/cucumber/cucumber.json", 
				"pretty:target/cucumber/cucumber-pretty.txt",
				"usage:target/cucumber/cucumber-usage.json", 
				"junit:target/cucumber/cucumber-results.xml" }

		)
public class RunnerClass {
	

}
