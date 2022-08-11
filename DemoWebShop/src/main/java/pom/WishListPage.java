package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends CommonPage{

	WebDriver driver;
	public WishListPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement wishlistaddtocartlink;
	
	@FindBy(xpath = "//input[@value='Update wishlist']")
	private WebElement updatewhishlistlink;
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement mailafriendlink;
	
	public WebElement getWishlistaddtocartlink() {
		return wishlistaddtocartlink;
	}

	public WebElement getUpdatewhishlistlink() {
		return updatewhishlistlink;
	}

	public WebElement getMailafriendlink() {
		return mailafriendlink;
	}
	
	

}
