package cogmentoCRM.Web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import cogmentoCRM.Web.base.BasePage;
import cogmentoCRM.Web.utilities.ExtentReportsManager;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[@class='user-display']")
	private WebElement logo_Username;

	@FindBy(xpath = "//i[@class='home icon']")
	private WebElement icon_Home;

	@FindBy(xpath = "//i[@class='users icon']/parent::a")
	private WebElement icon_Contacts;

	@FindBy(xpath = "//i[@class='users icon']/parent::a/following-sibling::button")
	private WebElement icon_AddContacts;

	@FindBy(xpath = "//i[@class='settings icon' ]/parent::div")
	private WebElement icon_Settings;

	@FindBy(xpath = "//a[@role='option']/span[contains(text(),'Out')]")
	private WebElement btn_Logout;

	@FindBy(xpath = "//i[@class='calendar icon']")
	private WebElement icon_Calender;

	public WebElement getIcon_Calender() {
		return icon_Calender;
	}

	public WebElement getLogo_Username() {
		elementActions.waitForElementToBeVisible(logo_Username, 2);
		return logo_Username;
	}

	public WebElement getIcon_Home() {
		return icon_Home;
	}

	public WebElement getIcon_Contacts() {
		return icon_Contacts;
	}

	public WebElement getIcon_AddContacts() {
		return icon_AddContacts;
	}

	public WebElement getIcon_Settings() {
		return icon_Settings;
	}

	public WebElement getBtn_Logout() {
		return btn_Logout;
	}

	public void click_btnIconsetting() {
		elementActions.clickElement(icon_Settings);
	}

	public void click_btnLogout() {
		elementActions.clickElement(btn_Logout);
	}

	public void clickIcon_Contacts() {
		try {
			elementActions.waitForElementToBeVisible(icon_Contacts, 2);
			elementActions.jsClick(driver, icon_Contacts);
		} catch (Exception e) {
			log.error(e.getMessage() + "Failed to click on AddContacts");
		}
	}

	public void clickIcon_AddContacts() {
		elementActions.jsClick(driver, icon_AddContacts);
	}

	public void clickIcon_Calender() {
		elementActions.waitForElementToBeVisible(icon_Contacts, 2);
		elementActions.jsClick(driver, icon_Calender);
	}

}
