package scripts;

import org.testng.annotations.Test;


import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	
	utilies.switchingtabs(driver);
	
	SkillraryDemoLoginPage sd= new 	SkillraryDemoLoginPage(driver);
	utilies.mousehover(driver,sd.getCousretab());
	sd.seleniumtrainingtab();
	
	AddtoCartPage d=new AddtoCartPage(driver);
	utilies.doubleclick(driver,d.getAddbtn());
	d.addtocartbtn();
	utilies.alertPopup(driver);

	}

}
