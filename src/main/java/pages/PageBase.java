package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;

public class PageBase {

	AppiumDriver driver;
	public static final long WAIT=10;

	public PageBase(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void waitForVisibility(MobileElement element){
		WebDriverWait wait =new WebDriverWait(driver,WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clear(MobileElement element) {
		waitForVisibility(element);
		element.clear();
	}

	public void click(MobileElement element) {
		waitForVisibility(element);
		element.click();
	}

	public void sendText(MobileElement element , String text) {
		waitForVisibility(element);
		element.sendKeys(text);
	}

	public String getAttribute(MobileElement element , String attribute) {
		waitForVisibility(element);
		return element.getAttribute(attribute);	
	}

}
