package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class EditUserAccountObj extends Base {

	public EditUserAccountObj() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement EditAccount;
	 
	@FindBy (xpath = "//input[@id='input-firstname']")
	private WebElement AddFN;
	
	@FindBy (xpath = "//input[@id='input-lastname']" )
	private WebElement AddLn;
	
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement AddEmail;
	
	@FindBy(xpath ="//input[@id='input-telephone']")
	private WebElement telephoneField;

	
	@FindBy (xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement OnContinueButton;
	
	@FindBy (xpath = " //body/div[@id='account-account']/div[1]")
	private WebElement MassegeDisplayed;

	
	public void UserAccountEdit() {
		WebDriverUtility.clickOnElement(EditAccount);
	}
    public void AddFName (String Fname) {
    	WebDriverUtility.clearTextUsingSendKeys(AddFN);
    	WebDriverUtility.enterValue(AddFN, "Abdul");
    	
    }
    public void AddLName(String Lname) {
    	WebDriverUtility.clearTextUsingSendKeys(AddLn);
    	WebDriverUtility.enterValue(AddLn, "Wahab");
    }

    public void AddEmailAddress (String Emailaddress) {
    	WebDriverUtility.clearTextUsingSendKeys(AddEmail);
    	WebDriverUtility.enterValue(AddEmail, "sameer_zeyaa@gmail.com");
    }
    
    public void AddPhoneNUm (String phoneNume) {
    	WebDriverUtility.clearTextUsingSendKeys(telephoneField);
    	WebDriverUtility.enterValue(telephoneField, "5714587444");
    	
    }
    public void ClickOnContinue () {
    	WebDriverUtility.clickOnElement(OnContinueButton);
    }
    
    public void massegeDisplayed() {
    	WebDriverUtility.isElementDisplayed(MassegeDisplayed);
    }


















}
