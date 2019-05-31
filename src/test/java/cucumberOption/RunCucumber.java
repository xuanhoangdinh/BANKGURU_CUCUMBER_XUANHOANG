package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/", monochrome = true, glue = {
		"stepDefinitions" }, tags = { "@LogInGuruBank,@CreateCustomer,@EditCustomer" })

public class RunCucumber {

}