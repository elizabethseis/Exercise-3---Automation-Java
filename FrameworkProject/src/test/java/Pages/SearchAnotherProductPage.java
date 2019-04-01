package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchAnotherProductPage {
	WebDriver driver100;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement TxtSearch;
	
	
	@FindBy(xpath="//input[@value='Ir']")
	WebElement BtnSearch;
	
	@FindBy(xpath="//span[contains(text(),'Alienware AW3418DW Monitor Gaming Curvo 34\", LED-L')]")
	WebElement LinkDisplay;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement BtnAddtoCart;
	
	@FindBy(xpath="//div[@id='hlb-cart-itemcount-text']")
	WebElement AmountProducts;
	
	@FindBy(xpath="//a[@id='a-autoid-0-announce']")
	WebElement BtnCarrito;
	

	public SearchAnotherProductPage(WebDriver driver) {
		this.driver100=driver;
		
	}
	
	public void SearchAnotherProductMethod() {	
		TxtSearch.sendKeys("Alienware Aw3418DW");
		BtnSearch.click();
		LinkDisplay.click();
		BtnAddtoCart.click();
		String AmountProduct= AmountProducts.getText();
		System.out.println("Amount of products into the Cart: " + AmountProduct);
		String ExpectedText = "2 productos en tu carrito";
		Assert.assertEquals(AmountProduct, ExpectedText);
		BtnCarrito.click();
	}
	
	

}
