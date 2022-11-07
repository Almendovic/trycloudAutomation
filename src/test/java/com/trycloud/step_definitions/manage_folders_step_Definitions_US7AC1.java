package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ManageFolderPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class manage_folders_step_Definitions_US7AC1 {

    BasePage basePage = new BasePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    ManageFolderPage manageFolderPage =new ManageFolderPage();

    Actions actions=new Actions(Driver.getDriver());





    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
      //  Driver.getDriver().get(ConfigurationReader.getProperty("trycloudUrl"));
       // wait.until(ExpectedConditions.visibilityOf(basePage.userName));
    //  basePage.userName.sendKeys("User21");
      //basePage.passWord.sendKeys("Userpass123");
      //basePage.loginPage.click();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        wait.until(ExpectedConditions.visibilityOf(manageFolderPage.filesTab));
       // actions.clickAndHold(manageFolderPage.filesTab).perform();

        manageFolderPage.filesTab.click();


    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        wait.until(ExpectedConditions.visibilityOf(manageFolderPage.addIcon));
        manageFolderPage.addIcon.click();

    }
    @When("user click \"new folder”")
    public void user_click_new_folder() {
        manageFolderPage.newFolder.click();

    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
        wait.until(ExpectedConditions.visibilityOf(manageFolderPage.inputBox));
      manageFolderPage.inputBox.clear();
      manageFolderPage.inputBox.sendKeys("new folder");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        wait.until(ExpectedConditions.visibilityOf(manageFolderPage.submitBtn));
        manageFolderPage.submitBtn.click();

    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        wait.until(ExpectedConditions.visibilityOf(manageFolderPage.newfolder));
        String expectecFolderName="new folder";
        String actualFolderName=manageFolderPage.newfolder.getText();

        Assert.assertEquals(expectecFolderName,actualFolderName);
        System.out.println("Title Verified: = "+manageFolderPage.newfolder.getText());

    }


}
