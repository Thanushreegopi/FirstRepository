package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandyCamcorderPage extends CommonPage {
	
	WebDriver driver;
	public HandyCamcorderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
	private WebElement handycamlink;
	
	public WebElement getHandycamlink() {
		return handycamlink;
	}
	
}
