package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneCoverPage extends CommonPage {
	
	WebDriver driver;	
	public PhoneCoverPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Phone Cover")
	private WebElement phonecoverlink;
	
	public WebElement getPhonecoverlink() {
		return phonecoverlink;
	}

	
	@FindBy(xpath = "//select[@id='product_attribute_80_2_37']//option[contains(.,'Apple')]")
	private WebElement manufacturelink;
	
	@FindBy(xpath = "//select[@id='product_attribute_80_1_38']//option[contains(.,'Blue')]")
	private WebElement colourlink;
	
	@FindBy(id = "addtocart_80_EnteredQuantity")
	private WebElement quantitylink;
	
	@FindBy(id = "add-to-cart-button-80")
	private WebElement addtocartlink;
	
	@FindBy(id = "add-to-wishlist-button-80")
	private WebElement wishlistlink;
	
	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public void setWishlistlink(WebElement wishlistlink) {
		this.wishlistlink = wishlistlink;
	}

	public void setPhonecoverlink(WebElement phonecoverlink) {
		this.phonecoverlink = phonecoverlink;
	}

	public WebElement getManufacturelink() {
		return manufacturelink;
	}

	public WebElement getColourlink() {
		return colourlink;
	}

	public WebElement getQuantitylink() {
		return quantitylink;
	}

	public WebElement getAddtocartlink() {
		return addtocartlink;
	}
	
	

}
