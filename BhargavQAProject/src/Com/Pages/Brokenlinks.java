package Com.Pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonFunctionLibrary.FunctionLibrary;
import CommonFunctionLibrary.PrimusBank;
import Utilities.PropertyFileUtil;

public class Brokenlinks {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\CommonJarFiles\\chromedriver.exe");
		
		ChromeDriver d1= new ChromeDriver();
		
		d1.get("www.google.co.in");
		
		d1.manage().window().maximize();
		
//        List<WebElement> Ele=d1.findElements(By.tagName("a"));
//      
//        System.out.println("Total Links are" +Ele.size());
//      
//        for(int i=0;i<Ele.size();i++) {
//    	  
//    	  WebElement web= Ele.get(i);
//    	  
//    	  String url=web.getAttribute("href");  */  
//		
		/*PrimusBank app = new PrimusBank();
		
		String results=app.AppLaunch(PropertyFileUtil.getvalueForKey("URL"));
		
		System.out.println(results);
    	  
		System.out.println(PropertyFileUtil.getvalueForKey("Browser")*/
		
		//FunctionLibrary CF=new FunctionLibrary();
		
		
        }
      

	}


