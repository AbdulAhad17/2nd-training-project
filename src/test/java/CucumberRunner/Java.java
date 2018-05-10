package CucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by aahad on 12/14/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"}

)
public class Java {
}
