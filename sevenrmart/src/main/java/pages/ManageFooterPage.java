package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage 
{
	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "(//i[@class='fas fa-edit']//parent::a)[1]")
	WebElement action;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement address;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonenumber;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;

	

	public ManageFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public ManageFooterPage actionButton() {
		action.click();
		return this;
	}

	public ManageFooterPage addressFooterTextInfo(String add) {
		address.clear();
		address.sendKeys(add);
		return this;
	}

	public ManageFooterPage phonenumberFooterTextInfo(String phno) {
		phonenumber.clear();
		phonenumber.sendKeys(phno);
		return this;
	}

	public ManageFooterPage emailFooterTextInfo(String emailid) {
		email.clear();
		email.sendKeys(emailid);
		return this;
	}

	public ManageFooterPage updateFooterTextInfo() {
		update.click();
		return this;
	}

	public boolean isAlertMessageIsDisplayed() {
		return alertmsg.isDisplayed();
	}
}
