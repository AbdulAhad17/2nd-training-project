package ScenarioDataTables;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aahad on 12/18/2017.
 */
public class ScenarioDatatables {

    private Map<String, Integer>   values;
    WebDriver driver = null;

  //  public ScenarioDatatables() {
  //      values  = new HashMap<String, Integer>();
   // }

    @Given("^I am on Facebook registration form$")
    public void i_am_on_Facebook_registration_form()
    {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.firefox.marionette", "false");
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.utopia.pk/");

    }

    @When("^I navigate to the Registration page$")
    public void i_navigate_to_the_Registration_page()
    {
        driver.findElement(By.xpath(".//*[@id='customer_register_link']")).click();

    }

    @When("^I submit the form with valid data$")
    public void i_submit_the_form_with_valid_data(DataTable table)
    {
        List<List<String>> data = table.raw();
        System.out.println("response" + data.get(0));


       // System.out.println("rows" + table.getGherkinRows().toString());


        driver.findElement(By.xpath(".//*[@id='create_customer']/div[1]/input")).sendKeys("First Name value");
        driver.findElement(By.xpath("//*[@id='create_customer']/div[2]/input")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath(".//*[@id='create_customer']/div[3]/input")).sendKeys("test18@mailinator.com");
        driver.findElement(By.xpath(".//*[@id='create_customer']/div[4]/input")).sendKeys("03453356678");
        driver.findElement(By.xpath(".//*[@id='create_customer']/div[5]/input")).sendKeys("12345678a");
        driver.findElement(By.xpath(".//*[@id='create_customer']/div[6]/input")).sendKeys("12345678a");
        driver.findElement(By.xpath(".//*[@id='create_customer']/div[7]/input")).click();
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @Then("^I check the form has been submitted$")
    public void i_check_the_form_has_been_submitted()
    {
        Assert.assertEquals("https://www.utopia.pk/account",driver.getCurrentUrl());
        driver.close();


    }
}
