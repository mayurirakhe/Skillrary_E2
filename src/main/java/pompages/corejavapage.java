package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavapage {
	@FindBy(xpath="//a[text()='core Java For Selenium Training']")
	private WebElement selenium;
	
	public  corejavapage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void seleniumtraining() {
		selenium.click();
		
	}

}
