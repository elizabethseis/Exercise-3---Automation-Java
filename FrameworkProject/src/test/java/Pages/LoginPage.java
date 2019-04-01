package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver100;
	
	
	@FindBy(xpath="//span[contains(text(),'Hola, Identifícate')]")
	WebElement LinkIdentificate;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement TxtUser;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement TxtPassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement BtnLogin;
	
	public LoginPage(WebDriver driver) {
		this.driver100=driver;
		
	}
	

	public void LoginMethod() {	
		LinkIdentificate.click();
		TxtUser.sendKeys(ReadJsonFile.UserName);
		TxtPassword.sendKeys(ReadJsonFile.Password);
		BtnLogin.click();
		
	}
	
}
