package electronics;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.CommonPage;
import pom.GiftCardPage;
import pom.VirtualGiftCardPage;

public class TC_Electronics_ST_004Test extends BaseClass{
	
	@Test
	public void addGiftCardToWishList() {
	
	CommonPage common= new CommonPage(driver);
	common.getGiftcardlink().click();
	
	GiftCardPage card = new GiftCardPage(driver);
	card.getVirutalgiftcardlink().click();
	
	VirtualGiftCardPage virtual = new VirtualGiftCardPage(driver);
	//virtual.getRecipientnametextfield().sendKeys(null);

	
	
	}

}
