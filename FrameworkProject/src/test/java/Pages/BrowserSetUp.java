package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.sbtqa.tag.pagefactory.PageFactory;

public class BrowserSetUp {
	public static WebDriver driver;

	
	public void JsonParam() throws Exception {
		ReadJsonFile ob1 = new ReadJsonFile();
		ob1.ReadJson();
		
		
	}
	
	public void OpenPage(String BaseURL){		
		System.out.println(BaseURL);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elizabeth.perez\\eclipse-workspace\\FrameworkProject\\Drivers\\chromedriver.exe");
		 driver  = new ChromeDriver();
		driver.get(BaseURL);	
		System.out.println(driver);
		
				
	}
	
	
	


}
