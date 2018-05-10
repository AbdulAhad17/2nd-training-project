package Parameterhandling;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by aahad on 12/15/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cucumber3"}

)
public class Runner
{

}


