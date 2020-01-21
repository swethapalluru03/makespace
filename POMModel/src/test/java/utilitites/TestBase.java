package utilitites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	protected ExtentReports reports;
	protected ExtentTest test;
	public static String projectPath = System.getProperty("user.dir");
	public static String reportFilePath = projectPath + "/Reports/";
	public static String reportPathName = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss-SSS").format(new Date()) + "_Report.html";

	public WebDriver launchBrowser() {
		reports = new ExtentReports(reportFilePath + "Web_Report_" + reportPathName, false);
		WebDriverManager.chromedriver().version("79").setup();
		driver = new ChromeDriver();
		driver.get("https://dev.mksp.co");
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;

	}

	public static WebElement waitForExpectedElement(WebDriver driver, final By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	/**
	 * Method to  Get page title 
	 * 
	 * @param driver
	 */
	public String getPageTitle(WebDriver driver) {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	public void tearDown(WebDriver driver) {
		driver.quit();

	}

	public void endReport() {
		reports.endTest(test);
		reports.flush();
	}
}
