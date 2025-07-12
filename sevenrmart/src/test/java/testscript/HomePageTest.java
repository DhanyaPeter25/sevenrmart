package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends Base
{
public HomePage homepage;
	
	@Test(retryAnalyzer = retry.Retry.class,description="Verify user can log out and is redirected to the login page.")
	public void isUserIsAbleToLogOut() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		homepage=loginpage.clickTheSignInButton();
		homepage.admin().userLogout();
	   
		
		/*loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();

		HomePage logoutpage = new HomePage(driver);
		logoutpage.admin();
		logoutpage.userLogout();*/

		boolean signpage = homepage.isSigninPageDisplayed();
		Assert.assertTrue(signpage,Constants.HOMEPAGETESTCHECKLOGOUT);

	}
}
