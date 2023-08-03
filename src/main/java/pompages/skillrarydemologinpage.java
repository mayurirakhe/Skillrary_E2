package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class skillrarydemologinpage {
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy (name="addresstype")
	private WebElement coursedd;
	
	public WebElement getCourseadd() {
		return coursedd;
		}
	public WebElement getCoursetab() {
		return coursetab;
	}
    @FindBy(xpath="//a{text()='Selenium Training']")
    private WebElement seleniumtraining;

    public skillrarydemologinpage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	}
    
    public void seleniumtrainingtab() {
    	seleniumtraining.click();
    }
}

