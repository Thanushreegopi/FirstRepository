package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VirtualGiftCardPage extends CommonPage {
	
	WebDriver driver;
	public VirtualGiftCardPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
				
	}
	
	@FindBy(id = "giftcard_1_RecipientName")
	private WebElement recipientnametextfield;
	
	@FindBy(id = "giftcard_1_RecipientEmail")
	private WebElement recipientemailtextfield;
	
	@FindBy(id = "giftcard_1_SenderName")
	private WebElement sendernametextfield;
	
	@FindBy(id = "giftcard_1_SenderEmail")
	private WebElement senderemailtextfield;
	
	@FindBy(id = "add-to-wishlist-button-1")
	private WebElement giftcardwishlistbutton;
	
	
	public WebElement getRecipientnametextfield() {
		return recipientnametextfield;
	}

	public WebElement getRecipientemailtextfield() {
		return recipientemailtextfield;
	}

	public WebElement getSendernametextfield() {
		return sendernametextfield;
	}

	public WebElement getSenderemailtextfield() {
		return senderemailtextfield;
	}

	public WebElement getGiftcardwishlistbutton() {
		return giftcardwishlistbutton;
	}
	
	

}
