package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage extends CommonPage {
	
	WebDriver driver;
	public CellPhonePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhoneLink;
	
	
	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}
}
