package pageObjects;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import core.Base;

	public class DesktopOb extends Base {


		public DesktopOb() {
			
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
		 
		private WebElement clickOnDeskTab;
		
		
		@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
		private WebElement clicKOnShowAllDesktops;
		
		@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
		private WebElement desktopTabIsDisplayed;
		
		public void Desktoptab() {
			clickOnDeskTab.click();
			
	}

	   public void showAllDesktops() {
		   clicKOnShowAllDesktops.click();
		   
	   }

	public void desktopTapDisplay() {
		desktopTabIsDisplayed.isDisplayed();
	}


	}
	
	


