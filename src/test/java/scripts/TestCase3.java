package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class TestCase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.searchTextbox(pdata.getPropertydata("coursedata"));
	s.searchbutton();
	
	CorejavaPage c=new CorejavaPage(driver);
		c.seleniumtraining();
	
	WishlistPage w=new WishlistPage(driver);
	utilies.switchFrame(driver);
	Thread.sleep(10000);
	w.playbutton();
	Thread.sleep(10000);
	w.pausebutton();
	utilies.switchbackframe(driver);
	w.addtowishlist();
	
	}
	

}
