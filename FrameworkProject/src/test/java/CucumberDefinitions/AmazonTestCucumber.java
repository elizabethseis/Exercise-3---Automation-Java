package CucumberDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.BrowserSetUp;
import Pages.CartPage;
import Pages.CleanCartPage;
import Pages.LoginPage;
import Pages.SearchAnotherProductPage;
import Pages.SearchProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonTestCucumber {
	public static WebDriver driver;
	
	@Given("^Open the page and go to the URL$")
	public void open_the_page_and_go_to_the_URL() throws Exception {
		BrowserSetUp OpenB= PageFactory.initElements(BrowserSetUp.driver, BrowserSetUp.class);
		OpenB.JsonParam();
			    
	}

	@When("^I enter valid mail and password$")
	public void i_enter_valid_mail_and_password() {
		LoginPage login = PageFactory.initElements(BrowserSetUp.driver, LoginPage.class);
		login.LoginMethod();
	}
	
	@Then("^Select the phone$")
	public void select_the_phone() {
		SearchProductPage SProduct = PageFactory.initElements(BrowserSetUp.driver, SearchProductPage.class);
		SProduct.SearchMethod();
	}
	
	@Then("^Validate cart$")
	public void validate_cart() {
		CartPage cart1 = PageFactory.initElements(BrowserSetUp.driver, CartPage.class);
		cart1.CartMethod();
	}

	@Then("^Select another product$")
	public void select_another_product() {
		SearchAnotherProductPage SearchProduct = PageFactory.initElements(BrowserSetUp.driver, SearchAnotherProductPage.class);
		SearchProduct.SearchAnotherProductMethod();
	}

	

	@Then("^clean the cart$")
	public void clean_the_cart() {
		CleanCartPage CleanCart = PageFactory.initElements(BrowserSetUp.driver, CleanCartPage.class);
		CleanCart.CleanCartMethod();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		BrowserSetUp.driver.close();

	}

}
