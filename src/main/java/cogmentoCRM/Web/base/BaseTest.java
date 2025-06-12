package cogmentoCRM.Web.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cogmentoCRM.Web.pageObjects.ContactsPage;
import cogmentoCRM.Web.pageObjects.CreateNewContactPage;
import cogmentoCRM.Web.pageObjects.HomePage;
import cogmentoCRM.Web.pageObjects.LoginPage;
import cogmentoCRM.Web.utilities.ConfigUtil;
import cogmentoCRM.Web.utilities.LoggerUtil;
import cogmentoCRM.Web.utilities.ObjectsInitializer;

/**
 * @author gangadhar.b
 */
public class BaseTest {

	// variables
	protected static WebDriver driver;
	protected static LoggerUtil log;
	protected static LoginPage loginPage;
	protected static HomePage homePage;
	protected static CreateNewContactPage createNewContactpage;
	protected static ContactsPage contactsPage;
	

	@BeforeTest
	public void setup() {
		driver = WebDriverFactory.getDriver();
		ObjectsInitializer.intialize();

	}

	@BeforeClass
	public void login() {
		String username = ConfigUtil.get("username");
		String password = ConfigUtil.get("password");
		loginPage.enterEmail(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		log.info("Logged into the Application...!");
	}

	@AfterClass
	public void logout() {
		homePage.getIcon_Settings().click();
		homePage.getBtn_Logout().click();
		log.info("Logged Out of the Application...!");
	}

	@AfterTest
	public void tearDown() {
		WebDriverFactory.quitDriver();
	}

}
