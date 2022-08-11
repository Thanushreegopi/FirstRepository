package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPage extends CommonPage {
	
	WebDriver driver;
	public GiftCardPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
	}
	
	@FindBy(linkText = "$5 Virtual Gift Card")
	private WebElement virutalgiftcardlink;
	public WebElement getVirutalgiftcardlink() {
		return virutalgiftcardlink;
	}
	

}
