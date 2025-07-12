package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage 
{
	public WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement uname;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//i[@class='fas fa-edit']//parent::a/i")
	WebElement action;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//textarea[@id='content']//parent::div/textarea[1]")
	WebElement address;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement update;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;

	

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public ManageContactPage actionManageContact() {
		action.click();
		return this;
	}

	public ManageContactPage phonenumberManageContact(String phno) {
		phone.clear();
		phone.sendKeys(phno);
		return this;
	}

	public ManageContactPage emailManageContact(String emailid) {
		email.clear();
		email.sendKeys(emailid);
		return this;
	}

	public ManageContactPage addressManageContact(String add) {
		address.clear();
		address.sendKeys(add);
		return this;
	}

	public ManageContactPage updateManageContact() {
		PageUtility pageutility = new PageUtility();
		pageutility.javaSriptClick(driver, update); // update.click();
		return this;
	}

	public boolean isAlertMessageIsDisplayed() {
		return alertmsg.isDisplayed();
	}
}
