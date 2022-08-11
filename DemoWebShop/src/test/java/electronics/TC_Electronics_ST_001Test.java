package electronics;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.CameraPhotoPage;
import pom.CompareListPage;
import pom.ElectronicsPage;
import pom.HandyCamcorderPage;

public class TC_Electronics_ST_001Test extends BaseClass {
	@Test
	public void electronics() {
		ElectronicsPage ele = new ElectronicsPage(driver);
		ele.getElectronislink().click();
		String eletitle = driver.getTitle();
		Reporter.log("Clicked on electronic link",true);
		assertEquals(eletitle,"Demo Web Shop. Electronics","Electronic page is not trigered");
		
		CameraPhotoPage camera = new CameraPhotoPage(driver);
		camera.getCameraphotolink().click();
		String camtitle = driver.getTitle();
		Reporter.log("Clicked on cameraphoto link",true);
		assertEquals(camtitle,"Demo Web Shop. Camera, photo","Camera/Photo page is not trigered");
		
		HandyCamcorderPage camcord = new HandyCamcorderPage(driver);
		camcord.getHandycamlink().click();
		String handycamtitle = driver.getTitle();
		Reporter.log("Clicked on HandyCamcorder link",true);
		assertEquals(handycamtitle,"Demo Web Shop. 1MP 60GB Hard Drive Handycam Camcorder","HandyCamCorder page is not trigered");
		  
		CompareListPage compare = new CompareListPage(driver);
		compare.getComparelistbutton().click();
		String comparelisttitle = driver.getTitle();
		Reporter.log("Clicked on HandyCamcorder link",true);
		assertEquals(comparelisttitle,"Demo Web Shop. Compare Products","Comparelist page is not trigered");
		
		
	}
	 
	

}
