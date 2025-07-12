package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	@FindBy(xpath = "//a[text()=' New']")
	WebElement newbtn;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernme;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwrd;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usrtype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebtn;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;
	@FindBy(xpath = "//table/tbody/tr[1]/td[5]/a[2]/i")
	WebElement edit;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement update;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement alert;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AdminUsersPage clickNewButton() {
		newbtn.click();
		return this;
	}

	public AdminUsersPage enterUserName(String user) {
		usernme.sendKeys(user);
		return this;
	}

	public AdminUsersPage enterPassword(String pass) {
		passwrd.sendKeys(pass);
		return this;
	}

	public AdminUsersPage selectUserType() {
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(usrtype, 2); // sc.selectByIndex(2);
		return this;
	}

	public AdminUsersPage saveAdminUsers() {
		savebtn.click();
		return this;
	}

	public boolean isDisplayAlertMessage() {
		return alertmsg.isDisplayed();
	}

	public AdminUsersPage editAdminUsers() {
		edit.click();
		return this;
	}

	public AdminUsersPage updateAdminUsers() {
		update.click();
		return this;
	}

	public boolean isDisplayAlert() {
		return alert.isDisplayed();
	}
}
