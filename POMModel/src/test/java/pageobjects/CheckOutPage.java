package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitites.TestBase;

public class CheckOutPage extends TestBase{

	public static final By FULLNAME_FIELD = By.name("fullName");
	public static final By PHONENUMBER_FIELD = By.name("phone");
	public static final By EMAIL_FIELD = By.name("email");
	public static final By RADIO_BUTTON = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/form/div[4]/div[2]/label[2]/span[1]");
	public static final By ADDRESS_FIELD = By.name("address_pretty");
	public static final By FLOOR_FIELD = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/input");
	public static final By CONFIRM_CONTINUE_BUTTON = By.xpath("//button[contains(text(),'Confirm and continue')]");
	public static final By DATE_PICKER = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div/div[2]/div[1]/div/input");
	public static final By DATE_PICKER_NEXT = By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']");
	public static final By DATE_PICKER_VALUE = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[7]");
	public static final By TIME_FIELD = By.name("Time");
	public static final By CARD_NUMBER = By.name("cardnumber");
	public static final By EXP_DATE = By.name("exp-date");
	public static final By CVC_FIELD = By.name("cvc");
	public static final By RADIO_AGREE_BUTTON = By.xpath("//*[@id='checkout']/div/div[2]/div[2]/div/div[1]/div[4]/div[3]/div[2]/div/label/span[1]");
	public static final By CONFIRM_APPOINTMENT_BUTTON = By.xpath("//button[contains(text(),'Confirm and book my appointment')]");
	
	/**
	 * Constructor
	 * 
	 * @param driver
	 */
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Method to Enter Fullname field
	 * 
	 * @param driver
	 */
	public void setFullNameField(WebDriver driver, String fullName) {
		waitForExpectedElement(driver, FULLNAME_FIELD);
		driver.findElement(FULLNAME_FIELD).sendKeys(fullName);
	}
	/**
	 * Method to Enter Phone number field
	 * 
	 * @param driver
	 */
	public void setPhoneNumberField(WebDriver driver, String phoneNumber) {
		waitForExpectedElement(driver, PHONENUMBER_FIELD);
		driver.findElement(PHONENUMBER_FIELD).sendKeys(phoneNumber);
	}
	/**
	 * Method to Enter email field
	 * 
	 * @param driver
	 */
	public void setEmailField(WebDriver driver, String email) {
		waitForExpectedElement(driver, EMAIL_FIELD);
		driver.findElement(EMAIL_FIELD).sendKeys(email);
	}
	/**
	 * Method to Click on Radio button
	 * 
	 * @param driver
	 */
	public void clickRadioButton(WebDriver driver) {
		waitForExpectedElement(driver, RADIO_BUTTON);
		driver.findElement(RADIO_BUTTON).click();
	}
	/**
	 * Method to Enter address field value
	 * 
	 * @param driver
	 */
	public void setAddressField(WebDriver driver, String address) throws Exception {
		waitForExpectedElement(driver, ADDRESS_FIELD);
		driver.findElement(ADDRESS_FIELD).sendKeys(address);
		driver.findElement(ADDRESS_FIELD).click();
		driver.findElement(ADDRESS_FIELD).sendKeys(Keys.ENTER);
	}
	/**
	 * Method to Enter Floor field value
	 * 
	 * @param driver
	 */
	public void setFloorField(WebDriver driver, String floor) {
		waitForExpectedElement(driver, FLOOR_FIELD);
		driver.findElement(FLOOR_FIELD).sendKeys(floor);
	}
	/**
	 * Method to Click on Confirm Continue Button
	 * 
	 * @param driver
	 */
	public void clickConfirmContinueButton(WebDriver driver) {
		waitForExpectedElement(driver, CONFIRM_CONTINUE_BUTTON);
		driver.findElement(CONFIRM_CONTINUE_BUTTON).click();
	}
	/**
	 * Method to Select Date from calendar icon
	 * 
	 * @param driver
	 * @return 
	 */
	public String selectDate(WebDriver driver) {
		waitForExpectedElement(driver, DATE_PICKER);
		driver.findElement(DATE_PICKER).click();
		waitForExpectedElement(driver, DATE_PICKER_NEXT);
		driver.findElement(DATE_PICKER_NEXT).click();
		waitForExpectedElement(driver, DATE_PICKER_VALUE);
		driver.findElement(DATE_PICKER_VALUE).click();
//		System.out.println(driver.findElement(DATE_PICKER_VALUE).getText());
		String text =  driver.findElement(DATE_PICKER_VALUE).getText();
		return text;
		
		}
	/**
	 * Method to Select time from dropdown
	 * 
	 * @param driver
	 */
	public void selectTime(WebDriver driver) throws Exception {
		waitForExpectedElement(driver, TIME_FIELD);
		driver.findElement(TIME_FIELD).click();
		driver.findElement(TIME_FIELD).sendKeys(Keys.ENTER);
		driver.findElement(TIME_FIELD).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(TIME_FIELD).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(TIME_FIELD).sendKeys(Keys.ENTER);
	}
	/**
	 * Method to enter Credit card details
	 * 
	 * @param driver
	 */
	public void setCardNumberField(WebDriver driver, String cardNumber) {
		driver.switchTo().frame("__privateStripeFrame5");
		waitForExpectedElement(driver, CARD_NUMBER);
		driver.findElement(CARD_NUMBER).clear();
		driver.findElement(CARD_NUMBER).sendKeys(cardNumber);
	}
	/**
	 * Method to enter Expiry date of the card
	 * 
	 * @param driver
	 */
	public void setExpDateField(WebDriver driver, String expDate) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("__privateStripeFrame6");
		waitForExpectedElement(driver, EXP_DATE);
		driver.findElement(EXP_DATE).sendKeys(expDate);
	}
	/**
	 * Method to enter CVC field
	 * 
	 * @param driver
	 */
	public void setCVCField(WebDriver driver, String cvc) {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("__privateStripeFrame7");
		waitForExpectedElement(driver, CVC_FIELD);
		driver.findElement(CVC_FIELD).sendKeys(cvc);
	}
	/**
	 * Method to Click on Agree radio button
	 * 
	 * @param driver
	 */
	public void clickRadioAgreeButton(WebDriver driver) {
		driver.switchTo().defaultContent();
		waitForExpectedElement(driver, RADIO_AGREE_BUTTON);
		driver.findElement(RADIO_AGREE_BUTTON).click();
	}
	/**
	 * Method to Click on COnfirm Appointment Button
	 * 	 * 
	 * @param driver
	 */
	public void clickConfirmAppointmentButton(WebDriver driver) {
		waitForExpectedElement(driver, CONFIRM_APPOINTMENT_BUTTON);
		driver.findElement(CONFIRM_APPOINTMENT_BUTTON).click();
	}
}
