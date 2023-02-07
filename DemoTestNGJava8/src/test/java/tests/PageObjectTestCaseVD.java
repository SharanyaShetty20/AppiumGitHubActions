package tests;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.PageObjectPage1;
import pages.PageObjectPage2;
import pages.PageObjectPage3;

public class PageObjectTestCaseVD {
	
	static AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
			
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Android Emulator");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "13");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<WebElement>(url, dc);
		
		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@Test
	public void pageObjectTestCase() {
		try {
			Thread.sleep(7000);
			PageObjectPage1 pageObjectPage1 = new PageObjectPage1(driver);
			pageObjectPage1.clickOnViews();
			
			PageObjectPage2 pageObjectPage2 = new PageObjectPage2(driver);
			pageObjectPage2.clickOnAutoComplete();
			
			PageObjectPage3 pageObjectPage3 = new PageObjectPage3(driver);
			pageObjectPage3.getScrollText();
			
		} catch (Exception e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
