package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.java.en.When;
import pageObjects.RegistrationOnRetailWebObj;
import utilities.WebDriverUtility;

public class LoginAcountStepDefinition extends Base {
	
	RegistrationOnRetailWebObj LoginToAcount = new RegistrationOnRetailWebObj();
	
	@When("^User enter username ‘userName’$")
	public void user_enter_username_userName() throws Throwable {
		LoginToAcount.EnterUserName("Sayedahmad.zeya@mail.com");  
		logger.info("User should enter his password");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	    
	}

	@When("^User enter password 'password’$")
	public void user_enter_password_password() throws Throwable {
		LoginToAcount.EnterPassword("4030");
		logger.info("User Should enter the Password");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

}
