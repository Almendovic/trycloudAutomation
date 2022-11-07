package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_step_Definitions_US1 {

    BasePage basePage = new BasePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloudUrl"));
        wait.until(ExpectedConditions.visibilityOf(basePage.userName));
    }

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode_userpass123(String str1, String str2) {
        basePage.userName.sendKeys(str1);
        basePage.passWord.sendKeys(str2);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        basePage.loginPage.click();

    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() throws InterruptedException {

        String expectedTitle = "Dashboard - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        wait.until(ExpectedConditions.titleIs(actualTitle));
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}



