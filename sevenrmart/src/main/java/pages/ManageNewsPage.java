package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage
{
	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = " //a[text()=' New']")
	WebElement newoption;
	@FindBy(xpath = " //textarea[@id='news']")
	WebElement enternews;
	@FindBy(xpath = " //button[@name='create']")
	WebElement save;
	@FindBy(xpath = " //div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	@FindBy(xpath = "//table/tbody/tr[3]/td[2]/a[1]/i")
	WebElement edit;
	@FindBy(xpath = "//button[@name='update']")
	WebElement update;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement alertmsg;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ManageNewsPage clickNewButton() {
		newoption.click();
		return this;
	}

	public ManageNewsPage enterNewsInformation(String news) {
		enternews.sendKeys(news);
		return this;
	}

	public ManageNewsPage saveNews() {
		save.click();
		return this;
	}

	public boolean isDisplayAlertMessage() {
		return alert.isDisplayed();
	}

	public ManageNewsPage editNews() {
		edit.click();
		return this;
	}

	public ManageNewsPage updateNews() {
		update.click();
		return this;
	}

	/*public boolean isDisplayAlert() {
		return alertmsg.isDisplayed();
	}*/
}
