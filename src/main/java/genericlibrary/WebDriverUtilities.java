package genericlibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities<JavascriptExecutor> {
	
	public void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		}
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		}
	public void  doubleClick (WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		}
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		}
	public void dragdrop (WebDriver driver,WebElement src,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
		}
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
		}
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().alert().accept();
		}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
		}
	public void switchingtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
			}
		}
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor ja=(JavascriptExecutor) driver;
		ja.executeScript("windows.scrollBy("+x+","+y+")");
		
		
	}
	
	
	}
