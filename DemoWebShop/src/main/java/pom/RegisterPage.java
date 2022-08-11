package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonPage{
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(id = "gender-female")
	private WebElement genderCheckBox;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
		
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassowrdTextFiled;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getGenderCheckBox() {
		return genderCheckBox;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPassowrdTextFiled() {
		return confirmPassowrdTextFiled;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	

}
