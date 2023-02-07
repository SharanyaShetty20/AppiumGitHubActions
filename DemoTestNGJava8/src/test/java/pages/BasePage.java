package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	protected AndroidDriver<WebElement> driver;
	
	public BasePage(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}

}
