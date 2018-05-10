package Cucumber2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aahad on 12/14/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/"}

)
public class JavaRunner {
}

