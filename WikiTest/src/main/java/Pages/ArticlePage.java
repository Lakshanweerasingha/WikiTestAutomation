package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ArticlePage {
	private AndroidDriver driver;
	private WebDriverWait wait;
	
	public ArticlePage(AndroidDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	private final By articleTitle = AppiumBy.id("org.wikipedia:id/view_page_title_text");

	public String getTitle() {
		WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(articleTitle));
		return titleElement.getText();
	}
	
	public void scrollToElementByText(String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(articleTitle));
        String uiAutomatorText = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + text + "\"))";
        driver.findElement(AppiumBy.androidUIAutomator(uiAutomatorText));
    }
}