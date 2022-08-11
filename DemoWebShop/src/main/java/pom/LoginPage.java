package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage{
	

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	@FindBy(id = "Email")
	private WebElement emailtextbox;
	
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	
	public WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	

}
