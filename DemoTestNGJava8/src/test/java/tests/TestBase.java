package tests;

import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AndroidDriver<WebElement> driver;

	public static void setup(String port, String deviceName, String platformVersion, String udid) {

		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			//dc.setCapability("deviceName", "Galaxy J7");
			dc.setCapability("deviceName", deviceName);
			//dc.setCapability("udid", "3300868aa3f4b2f9");
			dc.setCapability("udid", udid);
			dc.setCapability("platformName", "Android");
			//dc.setCapability("platformVersion", "6.0.1");
			dc.setCapability("platformVersion", platformVersion);
			//dc.setCapability("systemPort", systemPort);
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("noReset", true);
			
			dc.setCapability("appPackage", "com.samsung.android.app.memo");
			dc.setCapability("appActivity", "com.samsung.android.app.memo.Main");

			URL url = new URL("http://127.0.0.1:"+port+"/wd/hub");
			driver = new AndroidDriver<WebElement>(url, dc);

		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void setupVD(String port, String deviceName, String platformVersion, String udid) {

		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			//dc.setCapability("deviceName", "Android Emulator");
			dc.setCapability("deviceName", deviceName);
			dc.setCapability("platformName", "Android");
			//dc.setCapability("platformVersion", "13");
			dc.setCapability("udid", udid);
			dc.setCapability("platformVersion", platformVersion);
			//dc.setCapability("systemPort", systemPort);
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("noReset", true);
			
			dc.setCapability("appPackage", "goo.tasks");
			dc.setCapability("appActivity", "goo.tasks.MainActivity");

			URL url = new URL("http://127.0.0.1:"+port+"/wd/hub");
			driver = new AndroidDriver<WebElement>(url, dc);

		}catch(Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}
	}
}
