package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilitites.TestBase;

public class SelectPlanPage extends TestBase{
	public static final By SLECTPLAN_BUTTON = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/ul/li[2]/div/div[1]/div/div[3]/button");
	public static final By BIN_INPUT = By.name("bin");
	public static final By GOTIT_BUTTON = By.xpath("//button[contains(text(),'Got it!')]");
	public static final By VERIFY_TXT = By.className("makespace-ui-library-l7i6yw css-14f9sk53");
	public static final By CONTINUE_BUTTON = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/ul/li[2]/div/div[2]/div/div[2]/button");
	/**
	 * Constructor
	 * 
	 * @param driver
	 */
	public SelectPlanPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Method to Select Plan
	 * 
	 * @param driver
	 */
	public void clickSelectPlanButton(WebDriver driver) {
		waitForExpectedElement(driver, SLECTPLAN_BUTTON);
		driver.findElement(SLECTPLAN_BUTTON).click();
	}
	/**
	 * Method to enter Bin value
	 * 
	 * @param driver
	 */
	public void setBinValue(WebDriver driver, String binQuantity) {
		waitForExpectedElement(driver, BIN_INPUT);
		driver.findElement(BIN_INPUT).sendKeys(binQuantity);
	}
	/**
	 * Method to Click on Continue Button
	 * 
	 * @param driver
	 */
	public void clickContinueButton(WebDriver driver) {
		waitForExpectedElement(driver, CONTINUE_BUTTON);
		driver.findElement(CONTINUE_BUTTON).click();
	}
	/**
	 * Method to Click Got it Button
	 * 
	 * @param driver
	 */
	public void clickGotItButton(WebDriver driver) {
		waitForExpectedElement(driver, GOTIT_BUTTON);
		driver.findElement(GOTIT_BUTTON).click();
	}
}
