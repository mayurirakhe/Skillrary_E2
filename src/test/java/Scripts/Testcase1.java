package Scripts;






import org.testng.annotations.Test;



import genericlibrary.Baseclass;
import pompages.AddtoCartPage;
import pompages.skillrarydemologinpage;
import pompages.skillraryloginpage;

public class Testcase1 extends Baseclass {
	
	@Test
	
	public void tcl() {
		
		skillraryloginpage s=new skillraryloginpage(driver);
	
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
	    skillrarydemologinpage sd=new skillrarydemologinpage(driver);
	    utilities.mouseHover(driver,sd.getCoursetab());
	    sd.seleniumtrainingtab();
	    AddtoCartPage d=new AddtoCartPage(driver);
	    utilities.doubleClick(driver,d.getAddtn());
	    d.carttocartbtn();
	    utilities.alertPopup(driver);
	    
				
		
		
		
		
	}

}
