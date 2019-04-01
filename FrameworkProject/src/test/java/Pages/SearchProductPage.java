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
	
	@FindBy (xpath = "//body[@class='a-m-mx a-aui_149818-c a-aui_152852-c a-aui_157141-c a-aui_158613-c a-aui_160684-c a-aui_57326-c a-aui_72554-c a-aui_accessibility_49860-c a-aui_attr_validations_1_51371-c a-aui_bolt_62845-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_113788-c a-aui_ux_114039-c a-aui_ux_145937-c a-aui_ux_60000-c a-meter-animate']/div/div/div[@class='sg-row']/div[@class='sg-col-20-of-24 sg-col-28-of-32 sg-col-16-of-20 sg-col s-right-column sg-col-32-of-36 sg-col-8-of-12 sg-col-12-of-16 sg-col-24-of-28']/div[@class='sg-col-inner']/span[@class='rush-component s-latency-cf-section']/div[@class='s-result-list sg-row']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]\r\n") 
			WebElement Price;

	@FindBy (xpath = "//body[@class='a-m-mx a-aui_149818-c a-aui_152852-c a-aui_157141-c a-aui_158613-c a-aui_160684-c a-aui_57326-c a-aui_72554-c a-aui_accessibility_49860-c a-aui_attr_validations_1_51371-c a-aui_bolt_62845-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_113788-c a-aui_ux_114039-c a-aui_ux_145937-c a-aui_ux_60000-c a-meter-animate']/div/div/div[@class='sg-row']/div[@class='sg-col-20-of-24 sg-col-28-of-32 sg-col-16-of-20 sg-col s-right-column sg-col-32-of-36 sg-col-8-of-12 sg-col-12-of-16 sg-col-24-of-28']/div[@class='sg-col-inner']/span[@class='rush-component s-latency-cf-section']/div[@class='s-result-list sg-row']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[3]") 
	WebElement PriceFraction;
	
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
		WholeP=PriceFraction.getText();
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
