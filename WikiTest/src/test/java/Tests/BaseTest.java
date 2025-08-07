package Tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
	
		protected AndroidDriver driver;
		
		@BeforeClass
		public void setup() throws MalformedURLException {
			UiAutomator2Options options = new UiAutomator2Options()
					.setPlatformName("Android")
	                .setDeviceName("emulator-5554")
	                .setAppPackage("org.wikipedia")
	                .setAppActivity(".main.MainActivity")
	                .setAutomationName("UiAutomator2");
			
			driver = new AndroidDriver(new URL("http://localhost:4723"), options);
		}
		
		@AfterClass
		public void down() {
			if(driver != null) {
				driver.quit();
			}
		}
}
