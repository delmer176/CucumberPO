package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ebayTest.feature"
		,glue= {"steps"}
		,tags={"@spanish"}
		,plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
		)

public class RunnerTest {

}
