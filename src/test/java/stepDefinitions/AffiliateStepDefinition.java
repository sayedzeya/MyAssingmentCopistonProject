package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RegisterAffiliateObj;
import utilities.WebDriverUtility;

public class AffiliateStepDefinition extends Base  {
	
	RegisterAffiliateObj RegisterAF = new RegisterAffiliateObj();
	
	@Given("^User click on My Account$")
	public void user_click_on_My_Account() throws Throwable {
		RegisterAF.MyAccount();
		logger.info("User should click on my account");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@Given("^User put the email address$")
	public void user_put_the_email_address() throws Throwable {
		RegisterAF.Email("farea.zeya@gmail.com");
		logger.info("User should enter the email");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@Given("^user put the password$")
	public void user_put_the_password() throws Throwable {
		RegisterAF.PassWord("4030");
		logger.info("User should enter the password");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@Then("^User click on login Button$")
	public void user_click_on_login_Button() throws Throwable {
		RegisterAF.Clicklogin();
		logger.info("User should see success message");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
			RegisterAF.Affiliate();
			logger.info("User Should click on register");
			WebDriverUtility.wait(2000);
			WebDriverUtility.screenShot();
	}

	@When("^User fill affiliate form with below information |company|website|taxID|paymentMethod|$")
	public void user_fill_affiliate_form_with_below_information_company_website_taxID_paymentMethod() throws Throwable {
		RegisterAF.Company("OCGN");
		RegisterAF.WebSite("WWW.OCGN.COM");
		RegisterAF.TaxId("1952");
		RegisterAF.Cheque();
		logger.info("User should fill above info");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	@When("^User put Cheque Payee Name$")
	public void user_put_Cheque_Payee_Name() throws Throwable {
		RegisterAF.ChequeName("Sayed Sadad");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	}
	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		RegisterAF.Checkbox();
		logger.info("user should click on about us check box");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	} 
	

    @When("^User click on continue button$")
    public void user_click_on_continue_button() throws Throwable {
	RegisterAF.continues();
	logger.info("User Should click on continue button");
}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		RegisterAF.MassageDisplyed();
		logger.info("User should see success message");
		WebDriverUtility.wait(2000);
		WebDriverUtility.screenShot();
	   
	}

}
//     
//	@When("^User click on ‘Register for an Affiliate Account’ link$")
	
//	}
//
//	@When("^User fill affiliate form with below information |company|website|taxID|paymentMethod|$")
//	public void user_fill_affiliate_form_with_below_information_company_website_taxID_paymentMethod() throws Throwable {
		
		
//		
//	}
//
//	@When("^User check on About us check box$")
//	public void user_check_on_About_us_check_box() throws Throwable {
		
//	}
//
//	@Then("^User should see a success message$")
//	public void user_should_see_a_success_message() throws Throwable {
		
//	   
//	}
//
//
//}
