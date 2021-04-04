package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class CanonCameraObj extends Base {

	public CanonCameraObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement hoverOnDesktop;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement clickOnShowAllDesktop;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement clickAddToCartButton;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selectColor;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQTY;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickAddToCart;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement addedSuccess;

	public void desktop() {
		WebDriverUtility.clickOnElement(hoverOnDesktop);

	}

	public void showAllDesktopItems() {
		WebDriverUtility.clickOnElement(clickOnShowAllDesktop);
	}

	public void addToCart() {
		WebDriverUtility.clickOnElement(clickAddToCart);
	}

	public void color() {
		WebDriverUtility.clickOnElement(selectColor);
	}

	public void quantity() {
		WebDriverUtility.selectByIndex(selectQTY, 1 );
	}

	public void addcart() {
		WebDriverUtility.clickOnElement(clickAddToCart);

	}

	public void sucess() {
		WebDriverUtility.isElementDisplayed(addedSuccess);

	}

}
