package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage
{
	public WebDriver driver;
		
		@FindBy(xpath = "//input[@placeholder='Username']")
		WebElement uname;
		@FindBy(xpath = "//input[@placeholder='Password']")
		WebElement pword;
		@FindBy(xpath = "//button[@type='submit']")
		WebElement signin;
		@FindBy(xpath = "//div/nav/ul[2]/li/a")
		WebElement image;
		@FindBy(xpath = "//div/nav/ul[2]/li/div/a[2]")
		WebElement logout;
		@FindBy(xpath = "//button[text()='Sign In']")
		WebElement signinpage;
		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']//parent::div/a")WebElement moreinfoadmin;
		//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']//parent::li/a")WebElement moreinfo;
		@FindBy(xpath = "//div/div/div[9]/div/a")WebElement moreinfo;
		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']//parent::li/a")
		WebElement moreinfomcontact;
		@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']//parent::li/a")
		WebElement managefootermoreinfo;
		@FindBy(xpath = " //a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']//parent::li")
		WebElement moreinfonews;
		
		

		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	    
		public ManageNewsPage clickMoreInformation() {
			moreinfo.click();
			return new ManageNewsPage(driver);
		}
		
		public ManageFooterPage moreInfoManageFooter() {
			managefootermoreinfo.click();
			return new ManageFooterPage(driver);
		}
		public ManageContactPage moreInfoManageContact() {
			moreinfomcontact.click();
			return new ManageContactPage(driver);
		}

		public ManageCategoryPage moreInfoManageCategory() {
			PageUtility pageutility = new PageUtility();
			pageutility.javaSriptClick(driver, moreinfo); // moreinfo.click();
			return new ManageCategoryPage(driver);

		}
		public AdminUsersPage clickMoreInformationAdmin() {
			moreinfoadmin.click();
			return new AdminUsersPage(driver);
		}

		public HomePage admin() {
			image.click();
			return this;
		}

		public HomePage userLogout() {
			logout.click();
			return this;
		}

		public boolean isSigninPageDisplayed() {
			return signinpage.isDisplayed();
		}
}
