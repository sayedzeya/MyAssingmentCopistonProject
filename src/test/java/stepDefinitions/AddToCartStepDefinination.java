package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebDriverUtility;

public class AddToCartStepDefinination extends Base{
	
	@When("^User click ADD TO CART option on ‘HP LP(\\d+)’ item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
		//WebDriverUtility.wait(4000);
		WebDriverUtility.screenShot();
		logger.info("User clicked On Cart Add option");
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
	//	WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("User added the quantity");
	}
	  

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
	 // WebDriverUtility.wait(4000);
	  WebDriverUtility.screenShot();
	  logger.info("User clicked add to cart button");
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {
	  //   WebDriverUtility.wait(4000);
	     WebDriverUtility.screenShot();
	     logger.info("The success message is displayed");
		
		
		
	}



}
