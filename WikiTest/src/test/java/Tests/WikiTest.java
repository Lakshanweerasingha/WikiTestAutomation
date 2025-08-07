package Tests;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	public class WikiTest {
		
		protected AndroidDriver driver;
		
		@BeforeClass
		public void setup() {
			UiAutomator2Options options = new UiAutomator2Options()
					.setPlatformName("Android")
	                .setDeviceName("emulator-5554") // Use your device ID
	                .setAppPackage("org.wikipedia")
	                .setAppActivity(".main.MainActivity")
	                .setAutomationName("UiAutomator2");
			
			driver = new AndroidDriver(new URL("http://localhost:4723"), options);
		}

	}

	
}
