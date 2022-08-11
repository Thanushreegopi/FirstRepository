package electronics;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.CellPhonePage;
import pom.CommonPage;
import pom.ElectronicsPage;
import pom.PhoneCoverPage;


public class TC_Electronics_ST_002Test extends BaseClass {
	
	@Test
	public void addPhoneCover() {
		
		ElectronicsPage ele = new ElectronicsPage(driver);
		ele.getElectronislink().click();
		String eletitle = driver.getTitle();
		Reporter.log("Clicked on electronic link",true);
		assertEquals(eletitle,"Demo Web Shop. Electronics","Electronic page is not trigered");
		
		
		CellPhonePage cell = new CellPhonePage(driver);
		cell.getCellPhoneLink().click();
		String celltitle = driver.getTitle();
		Reporter.log("Clicked on cellphone link",true);
		assertEquals(celltitle,"Demo Web Shop. Cell phones","cell phone page is not trigered");
		
		PhoneCoverPage cover = new PhoneCoverPage(driver);
		cover.getPhonecoverlink().click();
		String phonecovertitle = driver.getTitle();
		Reporter.log("Clicked on phone cover link",true);
		assertEquals(phonecovertitle,"Demo Web Shop. Phone Cover","Phone cover page is not trigered");
		
		
		cover.getManufacturelink().click();
		//Select  select = new Select(cover.getManufacturelink());
		
		//String manufacturetitle = driver.getTitle();
		//Reporter.log("Clicked on phone cover link",true);
		//assertEquals(phonecovertitle,"Demo Web Shop. Phone Cover","Phone cover page is not trigered");
		
		cover.getColourlink().click();
		//cover.getQuantitylink().clear();
		cover.getAddtocartlink().click();
		
		CommonPage com = new CommonPage(driver);
		com.getShoppingcartlink().click();
		
	}
	
	
	

}
