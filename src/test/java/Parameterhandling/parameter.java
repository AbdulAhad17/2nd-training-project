package Parameterhandling;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aahad on 12/15/2017.
 */
public class parameter {
    WebDriver driver = null;
    @Given("^I am on website$")
    public void i_am_on_website() throws Throwable
    {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.firefox.marionette", "false");
        driver = new FirefoxDriver();
        driver.navigate().to("http://www.sqa.net/");

    }

    @When("^I click on the home page$")
    public void i_click_on_the_home_page()
    {
       WebElement buttonClick = driver.findElement(By.xpath("html/body/center/table[1]/tbody/tr[1]/td[1]/input"));
        //buttonClick.wait(5000);
        buttonClick.click();

    }

    @Then("^I Should be Navigate to the right page$")

    public void i_Should_be_Navigate_to_the_right_page()
    {
        Assert.assertEquals("http://www.sqa.net/index.htm", driver.getCurrentUrl());
        driver.close();
    }



    @When("^I click on SQA in theory page$")
    public void i_click_on_SQA_in_theory_page()
    {
        WebElement sqaintheory = driver.findElement(By.xpath("html/body/center/table[1]/tbody/tr[1]/td[2]/input"));
        sqaintheory.click();

        driver.close();

    }
    @Then("^I Should be Navigate to SQA in theory page$")
    public void i_Should_be_Navigate_to_SQA_in_theory_page()
    {
        Assert.assertEquals("http://www.sqa.net/cmmi.html",driver.getCurrentUrl());
        driver.close();
    }

    @When("^I click on SQA in practice page$")
    public void i_click_on_SQA_in_practice_page()
    {
        WebElement SQAinpractice = driver.findElement(By.xpath("html/body/center/table[1]/tbody/tr[1]/td[3]/input"));
        SQAinpractice.click();

       driver.close();
    }
    @Then("^I Should be Navigate to SQA in practice page$")
    public void i_Should_be_Navigate_to_SQA_in_practice_page() throws Throwable
    {
        Assert.assertEquals("http://www.sqa.net/sqa-practice.html",driver.getCurrentUrl());
            }
}


