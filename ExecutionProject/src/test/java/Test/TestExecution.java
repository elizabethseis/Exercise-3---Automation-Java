package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BrowserSetUp;
import Pages.CartPage;
import Pages.CleanCartPage;
import Pages.LoginPage;
import Pages.SearchAnotherProductPage;
import Pages.SearchProductPage;

public class TestExecution {
	@BeforeTest
	public void OpenBrowser() throws Exception {
		BrowserSetUp OpenB= PageFactory.initElements(BrowserSetUp.driver, BrowserSetUp.class);
		OpenB.JsonParam();
		;
	}
	@Test (priority=1)
	public void Logintest() {
		LoginPage login = PageFactory.initElements(BrowserSetUp.driver, LoginPage.class);
		login.LoginMethod();
	}
	
	@Test (priority=2)
	public void Searchtest() {
		SearchProductPage SProduct = PageFactory.initElements(BrowserSetUp.driver, SearchProductPage.class);
		SProduct.SearchMethod();
	}
	
	@Test (priority=3)
	public void CartTest() {
		CartPage cart1 = PageFactory.initElements(BrowserSetUp.driver, CartPage.class);
		cart1.CartMethod();
	}
	
	@Test (priority=4)
	public void SearchAnotherProductTest() {
		SearchAnotherProductPage SearchProduct = PageFactory.initElements(BrowserSetUp.driver, SearchAnotherProductPage.class);
		SearchProduct.SearchAnotherProductMethod();
				
	}
	
	@Test (priority=5)
	public void DeleteCartTest() {
		CleanCartPage CleanCart = PageFactory.initElements(BrowserSetUp.driver, CleanCartPage.class);
		CleanCart.CleanCartMethod();
				
	}
	
	@AfterTest
	public void CloseBrowser() {
		BrowserSetUp.driver.close();
	}
	

}
