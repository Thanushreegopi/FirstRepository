package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends CommonPage {
	WebDriver driver;
	
	public ElectronicsPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "(//a[contains(.,'Electronics')])[1]")
	private WebElement electronislink;
		
	

	public WebElement getElectronislink() {
		return electronislink;
	}		

}
