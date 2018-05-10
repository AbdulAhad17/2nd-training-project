package ScenarioDataTables;

/**
 * Created by aahad on 12/18/2017.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aahad on 12/15/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cucumber4"}

)
public class ScenarioRunner {

}
