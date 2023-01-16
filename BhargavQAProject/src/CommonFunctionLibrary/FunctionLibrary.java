package CommonFunctionLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PropertyFileUtil;

public class FunctionLibrary extends PropertyFileUtil {

	WebDriver driver;
	
	
	//Start Browser
	public static WebDriver startBrowser(WebDriver driver) throws Exception 
	{
		
		if(PropertyFileUtil.getvalueForKey("Browser").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\CommonJarFiles\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		else 
			if(PropertyFileUtil.getvalueForKey("Browser").equalsIgnoreCase("Chrome"))
			{
		    
				System.setProperty("webdriver.chrome.driver","C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\CommonJarFiles\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			else
				if(PropertyFileUtil.getvalueForKey("Browser").equalsIgnoreCase("IE"))
				{
					
					driver=new InternetExplorerDriver();
				}
		
		return driver;
	}
	
	
	//Open Application
	public static void openApplication(WebDriver driver) throws Exception {
		
		driver.manage().window().maximize();
		
		driver.get(PropertyFileUtil.getvalueForKey("URL"));
		
	}
	
	
	//TypeAction
	public static void typeAction(WebDriver driver, String Locatortype, String Locatorvalue, String Locatordata)
	{
		
		if(Locatortype.equalsIgnoreCase("id"))
		{
			
			driver.findElement(By.id(Locatorvalue)).clear();
			driver.findElement(By.id(Locatorvalue)).sendKeys(Locatordata);
		}
		else if(Locatortype.equalsIgnoreCase("name"))
		{
			
			driver.findElement(By.name(Locatorvalue)).clear();
			driver.findElement(By.name(Locatorvalue)).sendKeys(Locatordata);
		}
		else if(Locatortype.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(Locatorvalue)).clear();
			driver.findElement(By.xpath(Locatorvalue)).sendKeys(Locatordata);
			
		}
	}
	
	
	//Clickig Actions
	public static void clickAction(WebDriver driver,String Locatortype, String Locatorvalue)
	{
	   if(Locatortype.equalsIgnoreCase("id"))
	   {
			
			driver.findElement(By.id(Locatorvalue)).click();
			
		}
		else if(Locatortype.equalsIgnoreCase("name")) 
		{
			
			driver.findElement(By.name(Locatorvalue)).click();

		}
		else if(Locatortype.equalsIgnoreCase("xpath")) 
		{
			driver.findElement(By.xpath(Locatorvalue)).click();
			
			
		}
	
	}
	
	//close browser
	public static void closebrowser(WebDriver driver)
	{
		
		driver.close();
		
	}
	
	
	//Explict wait
	public static void waitForElement(WebDriver driver,String locatorType, String locatorvalue,String waitTime)
	{
		
		WebDriverWait wait= new WebDriverWait(driver,Integer.parseInt(waitTime));
		
		if(locatorType.equalsIgnoreCase("id"))
		{
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
		}else 
			
			if(locatorType.equalsIgnoreCase("name")) 
			{
			  
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
				
			}else if(locatorType.equalsIgnoreCase("xpath"))
			{
			  
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
		}
	}
		
		
	//Generate date
	public static String generateDate()
		{
		
			Date date= new Date();
	  		
			SimpleDateFormat sdf= new SimpleDateFormat("YYYY_MM_dd_ss");
			
		    return sdf.format(date);
		  	
		}
		
	//MouseClick
	public static void mouseClick(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[@name=\"btnAction\"]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//button[@name=\"btnAction\"]"))).click().build().perform();
	}
   
	//Dropdown
	
	public static void dropDown()
	{
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

