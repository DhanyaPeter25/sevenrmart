package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	public ManageNewsPage managenewspage;
	public HomePage homepage;

	@Test(retryAnalyzer = retry.Retry.class, description = "To verify that an authorized user is able to successfully Enter the 'News' information")

	public void verifyTheUserIsAbleToEnterTheNews() throws IOException {

		// String username="admin";
		// String password="admin";
		// String news="New Offer Alert!Don't miss out!Flash sale ends soon.";

		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		String news = ExcelUtility.getStringData(1, 0, "managenewspage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		managenewspage = homepage.clickMoreInformation();
		managenewspage.clickNewButton().enterNewsInformation(news).saveNews();

		/*
		 * loginpage.enterTheUserName(username); loginpage.enterThePassword(password);
		 * loginpage.clickTheSignInButton();
		 * 
		 * String news = ExcelUtility.getStringData(1, 0, "managenewspage");
		 * 
		 * ManageNewsPage managenewspage = new ManageNewsPage(driver);
		 * managenewspage.clickMoreInformation(); managenewspage.clickNewButton();
		 * managenewspage.enterNewsInformation(news); managenewspage.saveNews();
		 */

		boolean alertmessage = managenewspage.isDisplayAlertMessage();
		Assert.assertTrue(alertmessage, Constants.MANAGENEWSTESTENTERNEWS);
	}

	@Test(retryAnalyzer = retry.Retry.class, description = "To verify that an authorized user is able to successfully update the 'News' information")
	public void verifyTheUserIsAbleToUpdateTheNews() throws IOException {

		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		managenewspage = homepage.clickMoreInformation();
		managenewspage.editNews().updateNews();

		/*
		 * loginpage.enterTheUserName(username); loginpage.enterThePassword(password);
		 * loginpage.clickTheSignInButton();
		 * 
		 * ManageNewsPage managenewspage = new ManageNewsPage(driver);
		 * managenewspage.clickMoreInformation(); managenewspage.editNews();
		 * managenewspage.updateNews();
		 */

		// managenewspage.isDisplayAlert();

		boolean alertmsg = managenewspage.isDisplayAlertMessage();
		Assert.assertTrue(alertmsg, Constants.MANAGENEWSTESTUPDATENEWS);

	}
}
