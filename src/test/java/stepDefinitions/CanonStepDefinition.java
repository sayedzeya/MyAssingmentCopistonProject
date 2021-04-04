package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CanonCameraObj;
import utilities.WebDriverUtility;

public class CanonStepDefinition extends Base {
	
	
	CanonCameraObj AddCanon = new CanonCameraObj();
	
	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		AddCanon.addToCart();
		   logger.info("User click on Add to card");
		   WebDriverUtility.wait(3000);
			WebDriverUtility.screenShot();
	    
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		AddCanon.color();
		   logger.info("User select color from the droopdown box");
		   WebDriverUtility.wait(3000);
		   WebDriverUtility.screenShot();
	   
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
			AddCanon.sucess();
		   logger.info("User should see the success message after click add to cart button");
		   WebDriverUtility.wait(3000);
		   WebDriverUtility.screenShot();
		    
	
	
//	@When("^User click ADD TO CART option on ‘Canon EOS 5D’ item")
//	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
//		AddCanon.addToCart();
//	   logger.info("User click");
//	   WebDriverUtility.wait(3000);
//		WebDriverUtility.screenShot();
//	}
//
//	@When("^User select color from dropdown ‘Red’$")
//	public void user_select_color_from_dropdown_Red() throws Throwable {
//		AddCanon.color();
//	   logger.info("User select color from the droopdown box");
//	   WebDriverUtility.wait(3000);
//	   WebDriverUtility.screenShot();
//	}
//
//	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
//	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
//		AddCanon.sucess();
//	   logger.info("User should see the success message after click add to cart button");
//	   WebDriverUtility.wait(3000);
//	   WebDriverUtility.screenShot();
//	    
//	
	}
}
	
	
