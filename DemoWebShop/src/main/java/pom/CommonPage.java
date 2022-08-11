package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
	WebDriver driver;

	public CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement electroniclink;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftcardlink;
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(xpath = "//a[text()='Log out']/../..//a[@class='account']")
	private WebElement accountlink;
	
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcartlink;
	
	@FindBy(xpath = "//span[text()='Wishlist']/..")
	private WebElement whishlistlink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getElectroniclink() {
		return electroniclink;
	}

	public WebElement getGiftcardlink() {
		return giftcardlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}
	
	public WebElement getAccountlink() {
		return accountlink;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWhishlistlink() {
		return whishlistlink;
	}
	
	
	

}
