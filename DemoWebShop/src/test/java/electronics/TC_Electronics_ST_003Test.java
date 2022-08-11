package electronics;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.CellPhonePage;
import pom.CommonPage;
import pom.ElectronicsPage;
import pom.PhoneCoverPage;

public class TC_Electronics_ST_003Test extends BaseClass {
	
	@Test
	public void addToWhishlist() {
		
		ElectronicsPage ele = new ElectronicsPage(driver);
		ele.getElectroniclink().click();
		
		CellPhonePage cell = new CellPhonePage(driver);
		cell.getCellPhoneLink().click();
		
		PhoneCoverPage cover = new PhoneCoverPage(driver);
		cover.getPhonecoverlink().click();
		cover.getWishlistlink().click();
		
		CommonPage common = new CommonPage(driver);
		common.getWhishlistlink().click();
		
//		WishListPage wishlist = new WishListPage(driver);
//		wishlist.getWishlistaddtocartlink().click();
//		
	}

}
