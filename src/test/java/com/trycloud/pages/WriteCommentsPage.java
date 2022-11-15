package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteCommentsPage {
    public WriteCommentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='nametext'])[2]")
    public WebElement fileOnPage;

    @FindBy(xpath = "//span[@class='icon icon icon-details']")
    public WebElement detailsButton;

    @FindBy(xpath = "//a[@id='commentsTabView']")
    public WebElement commentsButton;

    @FindBy(xpath = "//div[@class= 'message']")
    public WebElement commentsBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement commentText;

}

