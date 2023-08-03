package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class photo {
	
	
	public void getPhoto(WebDriver driver,String name) throws IOException{
		Date d=new Date();
		String currrentdate = d.toString().replaceAll(":","-") ;
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src =   ts.getScreenshotAs(OutputType.FILE);
		
		File test=new File(Ipathconstant.photoPath+currrentdate+name+".png");
		FileUtils.copyFile(src,test);
		
		
		
	}

}
