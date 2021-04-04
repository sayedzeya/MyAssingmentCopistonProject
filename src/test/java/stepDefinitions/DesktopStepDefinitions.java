package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.DataBaseUtility;
import utilities.WebDriverUtility;

public class DesktopStepDefinitions extends Base {
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		 logger.info("User clicked on desktop tab and drop down box opened too!");
		    WebDriverUtility.screenShot();
		    
	   
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
	    logger.info("User click on show all desktops$");
	    WebDriverUtility.screenShot();
	    
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		logger.info("After user clicked on show all the desktop, desktop items are displyed");
	    WebDriverUtility.screenShot();
	}

	
}
