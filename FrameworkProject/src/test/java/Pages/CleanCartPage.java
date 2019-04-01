package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CleanCartPage {
	WebDriver driver100;
	
	
	
	@FindBy(xpath="//div[@class='a-column a-span8']//input[@value='Eliminar']")
	WebElement DeleteDisplay;
	
	@FindBy(xpath="//span[contains(text(),'Carrito')]")
	WebElement BtnCarrito;
	
	
	@FindBy(xpath="//div[@class='a-column a-span8']//input[@value='Eliminar']")
	WebElement DeletePhone;
	
	
	
	
	
	public CleanCartPage(WebDriver driver) {
		this.driver100=driver;
		
	}
	
	public void CleanCartMethod() {
		
		DeleteDisplay.click();
		BtnCarrito.click();
		DeletePhone.click();
		
	}

}
