package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchProductPage {
	WebDriver driver100;
	public String PriceSelected;
	public String ActualPriceS;
	public String WholeP;
	public String WholePrice;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement TxtSearch;
	
	
	@FindBy(xpath="//input[@value='Ir']")
	WebElement BtnSearch;

	@FindBy (className="a-price-whole") WebElement Price;

	@FindBy (className="a-price-fraction") WebElement PriceFraction;
	
	@FindBy(xpath="//span[contains(text(),'Samsung Galaxy S9 64GB Desbloqueado Negro Medianoc')]")
	WebElement ProductSelected;
	
	@FindBy(xpath="//span[@id='priceblock_ourprice']")
	WebElement ActualPrice;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement BtnAddtoCart;
	
	@FindBy(xpath="//div[@class='a-row a-size-base hlb-price a-color-price']")
	WebElement PriceCart;
	
	public SearchProductPage(WebDriver driver) {
		this.driver100=driver;
		
	}
	
	public void SearchMethod() {	
		TxtSearch.sendKeys("Samsung Galaxy S9 64GB");
		BtnSearch.click();
		PriceSelected=Price.getText();
		System.out.println("Price Selected: " + PriceSelected );
		WholeP=PriceFraction.getText();
		System.out.println("Price Fraction: " + WholeP );
		WholePrice= "$"+PriceSelected+"."+WholeP;
		System.out.println("Price Selected: " + WholePrice );
		ProductSelected.click();
		ActualPriceS=ActualPrice.getText();
		System.out.println("Detail Price: " + ActualPriceS);
		Assert.assertEquals(WholePrice, ActualPriceS);
		BtnAddtoCart.click();
		String PriceCart1= PriceCart.getText();
		System.out.println("Price into the Cart: " + PriceCart1);
		Assert.assertEquals(WholePrice, PriceCart1);
		
	}

	
	
}
