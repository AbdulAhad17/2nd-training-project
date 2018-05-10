package Scenariohooksoutline;

/**
 * Created by aahad on 12/19/2017.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cucumber5"}
)
public class Scenariohooksoutlinerunner
{

}
