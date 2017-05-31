package RankRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resource",
		format = {"pretty", "json:target/json/output.json", "html:target/html/"},
		tags = {"@Browser, @Staging, @NewRegistrationStep1"}
		)
public class RunnerTest {

}
