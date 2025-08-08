package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	private AndroidDriver driver;
	private WebDriverWait wait;
	
	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	// private final By skipButton = AppiumBy.id("org.wikipedia:id/fragment_onboarding_skip_button");
	 private final By search = AppiumBy.id("org.wikipedia:id/search_container");
	 
//	 public void initialSkip() {
//		 driver.findElement(skipButton).click();
//	 }
	 
	 public void tapSearch(){
		 WebElement searchContainer = wait.until(ExpectedConditions.elementToBeClickable(search));
		 searchContainer.click();
	 }
}
