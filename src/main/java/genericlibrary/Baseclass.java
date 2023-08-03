package genericlibrary;


import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.jce.provider.AnnotatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	protected Propertyfile pdata=new Propertyfile();
	public WebDriverUtilities utilities=new WebDriverUtilities();

	
	@BeforeTest
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.gerPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
		
		
		
		@AfterMethod
		
	public void  CloseApp(ITestResult res) throws IOException {
			int status =  res.getStatus();
			String name = res.getName();
			if(status==2) {
				photo p=new photo();
				p.getPhoto(driver, name);
				
			}
			
			driver.quit();
		}
		
		
}
	
	

