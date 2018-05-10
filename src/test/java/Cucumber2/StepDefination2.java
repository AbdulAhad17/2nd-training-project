package Cucumber2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by aahad on 12/14/2017.
 */
public class StepDefination2 {
    WebDriver driver = null;


    @Given("^I am on website$")
    public void i_am_on_website() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.firefox.marionette", "false");
        driver = new FirefoxDriver();
        driver.navigate().to("http://www.sqa.net/cmmi.html");

    }


    @When("^I click on the home page$")
    public void i_click_on_the_home_page() {
        driver.findElement(By.cssSelector("body > center > table:nth-child(6) > tbody > tr:nth-child(1) > td:nth-child(1) > input[type=\"button\"]")).click();
        System.out.println("On the home page");
    }

    @Then("^I Should be Navigate to the right page$")
    public void i_Should_be_Navigate_to_the_right_page() {
        assertEquals("http://www.sqa.net/index.htm", driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl() + "Should navigate to the Right Page");


    }

    @Then("^Text should appear SQA Definition on the home page$")
    public void text_should_appear_SQA_Definition_on_the_home_page() {
        driver.findElement(By.cssSelector("body > center > h3"));
        WebElement element = driver.findElement(By.cssSelector("body > center > h3"));
        String text = element.getText();
        assertEquals("SQA Definition", text);
        driver.close();

    }
}


