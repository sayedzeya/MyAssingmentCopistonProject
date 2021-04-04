package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetialsWebPoj extends Base  {
	
	public RetialsWebPoj () {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath = "//body")
	private WebElement retailWe;
}
