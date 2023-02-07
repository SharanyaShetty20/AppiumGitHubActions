package tests;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBaseVD {

	public static AndroidDriver<WebElement> driver;

	public static void setup() {

		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "Android Emulator");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "13");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("noReset", true);
			
			dc.setCapability("appPackage", "goo.tasks");
			dc.setCapability("appActivity", "goo.tasks.MainActivity");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<WebElement>(url, dc);

		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}
}
