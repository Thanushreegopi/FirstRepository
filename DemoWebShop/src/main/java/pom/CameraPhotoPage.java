package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CameraPhotoPage extends CommonPage {
	
	WebDriver driver; 
	public CameraPhotoPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}


	@FindBy(xpath = "//img[@alt='Picture for category Camera, photo']")
	private WebElement cameraphotolink;
	
	public WebElement getCameraphotolink() {
		return cameraphotolink;
	}
	
}
