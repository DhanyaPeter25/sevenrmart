package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alertmsg;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterTheUserName(String username) {
		uname.sendKeys(username);
		return this;
	}

	public LoginPage enterThePassword(String password) {
		pword.sendKeys(password);
		return this;
	}

	public HomePage clickTheSignInButton() {
		signin.click();
		return new HomePage(driver);
	}

	public boolean isDashBoardDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertMessageDisplayed() {
		return alertmsg.isDisplayed();
	}
}
