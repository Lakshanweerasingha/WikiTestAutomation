package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ArticlePage {
	private AndroidDriver driver;
	
	public ArticlePage(AndroidDriver driver) {
		this.driver = driver;
	}
	
	private final By articleTitle = AppiumBy.id("org.wikipedia:id/view_page_title_text");
}

	public getTitle() {
		
	}
