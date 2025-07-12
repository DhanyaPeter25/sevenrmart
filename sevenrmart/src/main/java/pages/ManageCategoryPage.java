package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
	WebElement newbtn;
	@FindBy(xpath = "//input[@id='category']")
	WebElement category;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement selectgrp;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement choosefilebtn;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement savebtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;

	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ManageCategoryPage newButton() {
		newbtn.click();
		return this;
	}

	public ManageCategoryPage categoryInformation(String catgry) {
		category.clear();
		category.sendKeys(catgry);
		return this;
	}

	public ManageCategoryPage selectGroup() {
		selectgrp.click();
		return this;
	}

	public ManageCategoryPage imageUpload() throws AWTException {
		WaitUtility waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, choosefilebtn);

		FileUploadUtility fileupload = new FileUploadUtility();
		// fileupload.fileuploadUsingRobertClass(choosefilebtn, Constants.IMAGEFILE);
		fileupload.fileUploadUsingSendKeys(choosefilebtn, Constants.IMAGEFILE);
		return this;
	}

	public ManageCategoryPage saveCategoryInformations() {

		PageUtility pageutility = new PageUtility();
		pageutility.javaSriptClick(driver, savebtn); // savebtn.click();
		return this;
	}

	public boolean isAlertMessageIsDisplayed() {
		return alertmsg.isDisplayed();
	}
}
