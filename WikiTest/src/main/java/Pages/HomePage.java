package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	private AndroidDriver driver;
	
	public HomePage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	// private final By skipButton = AppiumBy.id("org.wikipedia:id/fragment_onboarding_skip_button");
	 private final By search = AppiumBy.id("org.wikipedia:id/search_container");
	 
//	 public void initialSkip() {
//		 driver.findElement(skipButton).click();
//	 }
	 
	 public void tapSearch(){
		 driver.findElement(search).click();
	 }
}
