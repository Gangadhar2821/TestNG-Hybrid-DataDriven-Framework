package cogmentoCRM.Web.testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import cogmentoCRM.Web.base.BaseTest;
import cogmentoCRM.Web.pageObjects.CreateNewContactPage;

public class CreateNewContactTest extends BaseTest {

	@Test(priority = 1, dataProvider = "ExcelTestData", dataProviderClass = cogmentoCRM.Web.utilities.ExcelUtil.class)
	public void createNewContact(Map<String, String> data) {
		try {
			Assert.assertTrue(homePage.getLogo_Username().isDisplayed(), "User is not on HomePage");
			homePage.clickIcon_Contacts();
			contactsPage.clickBtnCreateContact();
			Assert.assertTrue(createNewContactpage.getLogo_screenTitle().isDisplayed(),
					"User failed to navigate to the CreateContact Page");
			createNewContactpage.fillContactDetails(data);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@Test(priority = 2, dependsOnMethods = "createNewContact", dataProvider = "ExcelTestData", dataProviderClass = cogmentoCRM.Web.utilities.ExcelUtil.class)
	public void validateCreatedContact(Map<String, String> data) {
		try {
			homePage.clickIcon_Contacts();
			contactsPage.validateCreatedContact(CreateNewContactPage.referenceValue);
		} catch (Exception e) {
			log.error(e.getMessage());
		}

	}
}
