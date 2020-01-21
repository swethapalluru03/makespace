package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilitites.TestBase;

public class ServicesPage extends TestBase{

	
	public static final By LARGE_ITEM = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/label[1]");
	public static final By BULK_ITEMS = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/label[2]");
	public static final By WALKUP_ITEMS = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/label[1]");
	public static final By FRAGILE_ITEMS = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div[1]/div[4]/div/div[2]/label[1]");
	public static final By DISASSEMBLY_ITEMS = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div[1]/div[5]/div/div[2]/label[2]");
	public static final By CONTINUE_BUTTON = By.xpath("//button[contains(text(),'Continue')]");
	/**
	 * Constructor
	 * 
	 * @param driver
	 */
	public ServicesPage(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * Method to Select Yes/No for Large Items
	 * 
	 * @param driver
	 */
	public void clickLargeItems(WebDriver driver) {
		waitForExpectedElement(driver, LARGE_ITEM);
		driver.findElement(LARGE_ITEM).click();
	}
	/**
	 * Method to Select Yes/No for Bulk Items
	 * 
	 * @param driver
	 */
	public void clickBulkItems(WebDriver driver) {
		waitForExpectedElement(driver, BULK_ITEMS);
		driver.findElement(BULK_ITEMS).click();
	}
	/**
	 * Method to Select Yes/No for Walkup Items
	 * 
	 * @param driver
	 */
	public void clickWalkUpItems(WebDriver driver) {
		waitForExpectedElement(driver, WALKUP_ITEMS);
		driver.findElement(WALKUP_ITEMS).click();
	}
	/**
	 * Method to Select Yes/No for Fragile Items
	 * 
	 * @param driver
	 */
	public void clickFragileItems(WebDriver driver) {
		waitForExpectedElement(driver, FRAGILE_ITEMS);
		driver.findElement(FRAGILE_ITEMS).click();
	}
	/**
	 * Method to Select Yes/No for Disassemble Items
	 * 
	 * @param driver
	 */
	public void clickDisassembleItems(WebDriver driver) {
		waitForExpectedElement(driver, DISASSEMBLY_ITEMS);
		driver.findElement(DISASSEMBLY_ITEMS).click();
	}
	/**
	 * Method to Click Continue Button
	 * 
	 * @param driver
	 */
	public void clickContinueButton(WebDriver driver) {
		waitForExpectedElement(driver, CONTINUE_BUTTON);
		driver.findElement(CONTINUE_BUTTON).click();
	}
}
