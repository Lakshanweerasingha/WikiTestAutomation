package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SearchPage {
	private AndroidDriver driver;
	private WebDriverWait wait;
	
	public SearchPage(AndroidDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	private final By searchInput = AppiumBy.id("org.wikipedia:id/search_src_text");
	private final By firstResult = AppiumBy.xpath("(//android.widget.TextView)[2])");


	public void search(String query) {
		WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
		searchField.sendKeys(query);
	}
	
	public void selectFirstResult() {
        WebElement firstResultElement = wait.until(ExpectedConditions.elementToBeClickable(firstResult));
        firstResultElement.click();
	}
}
