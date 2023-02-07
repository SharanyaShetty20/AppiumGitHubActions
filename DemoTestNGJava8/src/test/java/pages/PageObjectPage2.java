package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage2 extends BasePage{

	public PageObjectPage2(AndroidDriver<WebElement> driver) {
		super(driver);
	}

	@AndroidFindBy(xpath = "//*[@text = 'Auto Complete']")
	private AndroidElement autocomplete_Link;

	public void clickOnAutoComplete() throws Exception{
		
		Thread.sleep(3000);
		autocomplete_Link.click();

	}

}
