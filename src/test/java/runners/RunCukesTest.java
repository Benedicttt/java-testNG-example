package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        strict = true,
        features = "src/test/resources/features",
        glue = { "steps", "Hooks" }
)
//For gradle task test
public class RunCukesTest {}
