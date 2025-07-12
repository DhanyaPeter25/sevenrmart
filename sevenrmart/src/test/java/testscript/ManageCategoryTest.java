package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base{
	public ManageCategoryPage managecategory;
	public HomePage homepage;
	
	@Test(retryAnalyzer = retry.Retry.class,description="Verify that an authorized user can successfully add a new category via the category management module.")
	public void verifyTheUserIsAbleToAddCategoryInformations() throws IOException, AWTException {

		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		homepage=loginpage.clickTheSignInButton();
		managecategory=homepage.moreInfoManageCategory();
		FakerUtility fakerutility = new FakerUtility();
		String catgry = fakerutility.creatARandomFirstName();
		managecategory.newButton().categoryInformation(catgry).selectGroup().imageUpload().saveCategoryInformations();
				
		/*loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();

		// String catgry=ExcelUtility.getStringData(1, 0,"managecategorypage");

		ManageCategoryPage managecategory = new ManageCategoryPage(driver);

		managecategory.moreInfoManageCategory();
		managecategory.newButton();

		FakerUtility fakerutility = new FakerUtility();
		String catgry = fakerutility.creatARandomFirstName();

		managecategory.categoryInformation(catgry);
		managecategory.selectGroup();
		managecategory.imageUpload();
		managecategory.saveCategoryInformations();*/

		boolean alertmsg = managecategory.isAlertMessageIsDisplayed();
		Assert.assertTrue(alertmsg,Constants.MANAGECATEGORYTESTADDCATEGORY);
	}
}
