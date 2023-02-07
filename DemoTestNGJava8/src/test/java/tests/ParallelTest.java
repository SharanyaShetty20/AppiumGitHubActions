package tests;

import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelTest {
	
	public static AndroidDriver<WebElement> driver;
	
	@Test
	public static void realdevice() {
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "Galaxy J7");
			dc.setCapability("udid", "3300868aa3f4b2f9");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "6.0.1");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("noReset", true);
			dc.setCapability("app", "D:\\APK\\proverbial_android.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<WebElement>(url, dc);

		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@Test
	public static void virtualdevice() {
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "Android Emulator");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "13");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("noReset", true);
			dc.setCapability("app", "D:\\APK\\proverbial_android.apk");
			
			URL url = new URL("http://127.0.0.1:4000/wd/hub");
			driver = new AndroidDriver<WebElement>(url, dc);

		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}

}
