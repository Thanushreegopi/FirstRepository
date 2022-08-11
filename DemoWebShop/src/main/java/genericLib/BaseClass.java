package genericLib;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.CommonPage;
import pom.LoginPage;

/***
 * 
 * @author Thanu
 *
 */

public class BaseClass implements FrameWorkConstants {
	public WebDriver driver;
	@BeforeClass
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
		Reporter.log("Window is maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(BaseURL);
		String title = driver.getTitle();
		assertEquals(title,"Demo Web Shop","Home page is not displayed");
				
	}
	
	@BeforeMethod
	public void Login() {
		
		LoginPage login = new LoginPage(driver);
		login.getLoginlink().click();
		Reporter.log("Login link is clicked");
		String logintitle = driver.getTitle();
		assertEquals(logintitle,"Demo Web Shop. Login","Login page is not displayed");
		
		login.getEmailtextbox().sendKeys(Username);
		String loginuser = login.getEmailtextbox().getAttribute("value");
		Reporter.log("Username is entered");
		assertEquals(Username,loginuser,"Username is invalid");
		
		login.getPasswordtextfield().sendKeys(Password);
		String loginpwd = login.getPasswordtextfield().getAttribute("value");
		Reporter.log("Password is entered");
		assertEquals(Password,loginpwd,"Password is invalid");
		
		login.getLoginbutton().click();
		Reporter.log("Login button is clicked");
		CommonPage comm= new CommonPage(driver);
		String account = comm.getAccountlink().getText();
		assertEquals(account,Username,"invalid account");
				
	}
	 
	@AfterMethod
	public void logout() {
		CommonPage logout = new CommonPage(driver);
		logout.getLogoutlink().click();
		LoginPage login = new LoginPage(driver);
//		login.getLoginlink().click();
//		String logintitle = driver.getTitle();
//		logout.getLogoutlink().click();
//		Reporter.log("Logout is trigered");
		boolean logoutlnk = logout.getLoginlink().isDisplayed();
//		assertEquals(logoutlnk, logintitle,"account logout is not successfull");
		  
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("browser closed");
		
	}
	

}
