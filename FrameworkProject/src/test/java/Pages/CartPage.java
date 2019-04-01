package Pages;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import ru.sbtqa.tag.pagefactory.PageFactory;

public class CartPage {
	WebDriver driver100;
	
	

	
	
	
	@FindBy(xpath="//div[@id='hlb-cart-itemcount-text']")
	WebElement AmountProducts;
	
	public CartPage(WebDriver driver) {
		this.driver100=driver;
		
	}
	
	public void CartMethod() {
		
		String AmountProduct= AmountProducts.getText();
		System.out.println("Amount of products into the Cart: " + AmountProduct);
		String ExpectedText = "1 producto en tu carrito";
		Assert.assertEquals(AmountProduct, ExpectedText);

	}
	
	

	
	
}
