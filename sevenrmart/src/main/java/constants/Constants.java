package constants;

public class Constants
{
	public static final String TESTDATAFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\Test.xlsx";
	public static final String CONFIGFILE = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";
	public static final String IMAGEFILE = System.getProperty("user.dir") + "\\src\\test\\resources\\TestImg.jpg";
    public static final String LOGINTESTVALIDCREDENTIALS="Home Page is Not Loaded With Valid Credentials";
    public static final String LOGINTESTINVALIDPASSWORD="Home Page is Loaded With Incorrect Password";
    public static final String LOGINTESTINVALIDUSERNAME="Home Page is Not Loaded With Incorrect Username";
    public static final String LOGINTESTINVALIDCREDENTIALS="Home Page is Not Loaded With Incorrect Username and Password";
    public static final String ADMINUSERSTESTCREATEUSERS="Failed to create an admin user";
    public static final String ADMINUSERSTESTUPDATEUSERS="User information not updated as expected";
    public static final String HOMEPAGETESTCHECKLOGOUT= "Logout failed. Please try again";
    public static final String MANAGECATEGORYTESTADDCATEGORY= "Failed to add category: 'New Category' not found in the list after addition";
    public static final String MANAGECONTACTTESTUPDATECONTACT = "Contact information not updated as expected";
    public static final String MANAGECONTACTTESTDISPLAYCONTACT= "Contact information not displayed as expected";
    public static final String MANAGEFOOTERTESTUPDATEFOOTER= "Manage Footer information not updated as expected";
    public static final String MANAGENEWSTESTENTERNEWS= "News information not displayed as expected";
    public static final String MANAGENEWSTESTUPDATENEWS= "News information not updated as expected";
}
