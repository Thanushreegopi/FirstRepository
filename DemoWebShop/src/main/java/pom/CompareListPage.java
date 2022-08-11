package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareListPage  extends CommonPage {
	WebDriver driver;
	
	public CompareListPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@value=\"Add to compare list\"]")
	private WebElement comparelistbutton;
	
	public WebElement getComparelistbutton() {
		return comparelistbutton;
	}
	
}

