package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	public ManageContactPage managecontactpage;
	public HomePage homepage;

	@Test(description = "To verify that an authorized user is able to successfully update the 'Contact Us' information")
	public void verifyTheUserIsAbleToUpdateContactUsInformations() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		String managephoneno = ExcelUtility.getIntegerData(1, 0, "managecontactpage");
		String manageemail = ExcelUtility.getStringData(1, 1, "managecontactpage");
		String manageaddress = ExcelUtility.getStringData(1, 2, "managecontactpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		managecontactpage = homepage.moreInfoManageContact();
		managecontactpage.actionManageContact().phonenumberManageContact(managephoneno).emailManageContact(manageemail)
				.addressManageContact(manageaddress).updateManageContact();

		/*
		 * loginpage.enterTheUserName(username); loginpage.enterThePassword(password);
		 * loginpage.clickTheSignInButton();
		 * 
		 * String managephoneno = ExcelUtility.getIntegerData(1, 0,
		 * "managecontactpage"); String manageemail = ExcelUtility.getStringData(1, 1,
		 * "managecontactpage"); String manageaddress = ExcelUtility.getStringData(1, 2,
		 * "managecontactpage");
		 * 
		 * ManageContactPage managecontactpage = new ManageContactPage(driver);
		 * managecontactpage.moreInfoManageContact();
		 * managecontactpage.actionManageContact();
		 * managecontactpage.phonenumberManageContact(managephoneno);
		 * managecontactpage.emailManageContact(manageemail);
		 * managecontactpage.addressManageContact(manageaddress);
		 * managecontactpage.updateManageContact();
		 */

		boolean alertmsg = managecontactpage.isAlertMessageIsDisplayed();
		Assert.assertTrue(alertmsg, Constants.MANAGECONTACTTESTUPDATECONTACT);
	}

	@Test(description = "To verify that an authorized user is able to successfully display the 'Contact Us' information")
	public void verifyTheUserIsAbleToDisplayContactUsInformations() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		managecontactpage = homepage.moreInfoManageContact();
		managecontactpage.actionManageContact().updateManageContact();

		/*
		 * loginpage.enterTheUserName(username); loginpage.enterThePassword(password);
		 * loginpage.clickTheSignInButton();
		 * 
		 * ManageContactPage managecontactpage = new ManageContactPage(driver);
		 * managecontactpage.moreInfoManageContact();
		 * managecontactpage.actionManageContact();
		 * managecontactpage.updateManageContact();
		 */

		boolean alertmsg = managecontactpage.isAlertMessageIsDisplayed();
		Assert.assertTrue(alertmsg, Constants.MANAGECONTACTTESTDISPLAYCONTACT);
	}
}
