package Scenariohooksoutline;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by aahad on 12/19/2017.
 */
public class Scenariohooksoutline
{
   // private Map<String, String> values;
    WebDriver driver = null;


    @Given("^I am on Ecommerce website$")
    public void i_am_on_Ecommerce_website() {

        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.firefox.marionette", "false");
        driver = new FirefoxDriver();
        driver.navigate().to("https://www.wix.com/ecommerce/website");
    }

    @When("^I click on Registration link$")
    public void i_click_on_Registration_link()
    {
        driver.findElement(By.id("i61usvyplink")).click();
//        driver.findElement(By.xpath("html/body/login-dialog/div/login/div/form/div[2]/a")).click();

    }

    @When("^I filled the Registration with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_filled_the_Registration_with_and(String email, String emailAddress, String password, String passwordAgain)
    {
        driver.findElement(By.xpath(".//*[@id='input_0']")).sendKeys(email);
        driver.findElement(By.xpath(".//*[@id='input_3']")).sendKeys(emailAddress);
        driver.findElement(By.xpath(".//*[@id='input_1']")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='input_2']")).sendKeys(passwordAgain);
        driver.findElement(By.xpath("html/body/login-dialog/div/signup/div/form/div[3]/div[1]/div[2]/div/button")).click();


    }

    @Then("^User Registration successfully created$")
    public void user_Registration_successfully_created()
    {
//        Assert.assertEquals("https://www.wix.com/website/templates/html/online-store?uaToken=",driver.getCurrentUrl());
        driver.close();

    }


}
