package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.WriteCommentsPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Write_comments_step_definitions {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 50);

    BasePage basePage = new BasePage();
    WriteCommentsPage writeCommentsPage = new WriteCommentsPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(writeCommentsPage.fileOnPage).contextClick().perform();

    }

    @When("user choose the Details option")
    public void user_choose_the_option() {
        // writeCommentsPage.detailsButton.click();
        actions.click(writeCommentsPage.detailsButton).perform();

    }


    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        writeCommentsPage.submitButton.click();

    }

    @Then("Verify the {string} is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section(String comment) {
        String actualComment = writeCommentsPage.commentText.getText();
        String expectedCommented = comment;
        Assert.assertEquals(actualComment,expectedCommented);
    }


    @And("user write a comment{string} inside the input box")
    public void userWriteACommentInsideTheInputBox(String comment) {
        writeCommentsPage.commentsButton.click();
        writeCommentsPage.commentsBox.sendKeys(comment);

    }
}
