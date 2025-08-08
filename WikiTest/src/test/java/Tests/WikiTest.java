package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ArticlePage;
import Pages.HomePage;
import Pages.SearchPage;

public class WikiTest extends BaseTest{
	
		@Test
		public void WikiSearchText() throws InterruptedException {
			HomePage homepage = new HomePage(driver);
			SearchPage searchPage = new SearchPage(driver);
			ArticlePage articlePage = new ArticlePage(driver);
			
			homepage.tapSearch();
			
			searchPage.search("Appium");
			searchPage.selectFirstResult();
			
			String title = articlePage.getTitle();
			Assert.assertTrue(title.toLowerCase().contains("Appium"));
			
			articlePage.scrollToElementByText(title);
		}
	
}
