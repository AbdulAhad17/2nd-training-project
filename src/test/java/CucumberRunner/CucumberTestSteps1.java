package CucumberRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;

/**
 * Created by aahad on 12/13/2017.
 */
public class CucumberTestSteps1 {


    public void this_is_my_first_test() {
        System.out.println("Given");
    }

   @Given ("^This is my second test$")
    public void this_is_my_second_test() {
        System.out.println("When");
    }

    @Then("^This is my third test$")
    public void this_is_my_third_test() {
        System.out.println("Then");
    }
}
