package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage1 extends BasePage {

	public PageObjectPage1(AndroidDriver<WebElement> driver) {
		super(driver);
	}

	@AndroidFindBy(xpath = "//*[@text = 'Views']")
	private AndroidElement views_Link;

	public void clickOnViews() throws Exception{
		
		views_Link.click();

	}
}
