package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SearchPage {
	private AndroidDriver driver;
	
	public SearchPage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	private final By searchInput = AppiumBy.id("org.wikipedia:id/search_src_text");
	private final By firstResult = AppiumBy.xpath("(//android.widget.TextView)[2])");


	private void search(String query) {
		driver.findElement(searchInput).sendKeys(query);
	}
	
	private void selectFirstResult() {
		driver.findElement(firstResult).click();
	}
}
