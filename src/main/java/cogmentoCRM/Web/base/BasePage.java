package cogmentoCRM.Web.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import cogmentoCRM.Web.utilities.ElementActionsImpl;
import cogmentoCRM.Web.utilities.LoggerUtil;

public class BasePage {

	protected static WebDriver driver;
	protected ElementActionsImpl elementActions;
	protected LoggerUtil log;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.elementActions = new ElementActionsImpl(driver);
	}

	public static String ScreenShotOnFailure(ITestResult result) throws IOException {
		LoggerUtil log = new LoggerUtil();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());
		String testName = result.getName();

		String screenshotFileName = "./errorshots/" + testName + "@Test_failed on_" + timestamp + ".png";

		// Create directory if it doesn't exist (for relative path)
		File directory = new File("./errorshots/");
		if (!directory.exists()) {
			directory.mkdirs(); // Create the directory if it doesn't exist
		}
		// Save the screenshot to the specified path
		File destFile = new File(screenshotFileName);
		FileHandler.copy(screenshot, destFile);
		log.info("Failed Screenshot has been taken and saved to " + destFile.getAbsolutePath());

		// Return the file path for the Extent report for attachment
		return destFile.getAbsolutePath();

	}
}
