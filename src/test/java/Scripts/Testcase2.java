package Scripts;

import org.testng.annotations.Test;

import genericlibrary.Baseclass;
import pompages.TestingPage;
import pompages.skillrarydemologinpage;
import pompages.skillraryloginpage;

public class Testcase2 extends Baseclass {
	
	@Test
	
	public void tc2() {
		skillraryloginpage s=new skillraryloginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		skillrarydemologinpage ad=new skillrarydemologinpage(driver);
		utilities.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp=new TestingPage(driver);
		utilities.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
		
		
	}
	

}
