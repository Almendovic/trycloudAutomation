package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFolderPage {


    public ManageFolderPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesTab;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//*[@id=\"view13-input-folder\"]")
    public WebElement inputBox;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/form/input[2]")
    public WebElement submitBtn;

    @FindBy(xpath = "(//span[contains(normalize-space(),'new folder')])[2]")
    public WebElement newfolder;

    @FindBy(xpath = "//span[normalize-space()='Upload file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy(xpath = "(//span[contains(normalize-space(),'all_Interview_Prep_updated_-1')])[2]")
    public WebElement fileTobeVerified;






}
