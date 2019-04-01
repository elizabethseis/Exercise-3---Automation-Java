package Pages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;


public class ReadJsonFile {
	public static String UserName;
	public static String Password;

		// TODO Auto-generated method stub
	public static void ReadJson() throws Exception {
		Object obj = new JSONParser().parse(new FileReader("JSONfile.json")); 
		JSONObject jo = (JSONObject) obj;
		String BaseURL = (String) ((HashMap) obj).get("BaseURL");
       UserName = (String) ((HashMap) obj).get("UserName");
        Password = (String) ((HashMap) obj).get("Password");
       //System.out.println(BaseURL + UserName + Password );
       BrowserSetUp ob2 = new BrowserSetUp();
       ob2.OpenPage(BaseURL);
       //LoginPage ob3 = new LoginPage(driver);
      // ob3.user(UserName);
       //ob3.pass(Password);
   
   

    
	 }
	
}
