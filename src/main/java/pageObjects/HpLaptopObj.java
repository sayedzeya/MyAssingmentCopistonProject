package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HpLaptopObj extends Base {
	
	
	public HpLaptopObj () {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement userIsOnDesktop;
	
	@FindBy (xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement clickOnShowAllDesktop;
	  
	@FindBy(xpath = "//body/div[@id='User click ADD TO CART option on ‘HP LP3065’ itemproduct-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement clickAddToCardMenu;
	
	@FindBy(xpath ="//input[@id='input-quantity']")
    private WebElement selectQty;
	
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickAddToCard;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement addSuccess;
	
	
	public void  deskTops() {
		
		userIsOnDesktop.click();
		
	}
	 
	public void showAllDesktops() {
		
		clickOnShowAllDesktop.click();
	}
	 
	public void addToCartMunu() {
		
		clickAddToCardMenu.click();
	}
	
	public void selectAddQty() {
		selectQty.sendKeys("12");
		//selectQty.click();
	}
	
	public void AddToCart() {
		
		clickAddToCard.click();
		
	}
	
	public void success() {
		addSuccess.isDisplayed();
	}
	
	

}
