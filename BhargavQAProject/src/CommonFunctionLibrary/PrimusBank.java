package CommonFunctionLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusBank {
	ChromeDriver driver;
	
	String res;

	public String AppLaunch(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\CommonJarFiles\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get(url);
		
		//validation
		
		if(driver.findElement(By.id("txtuId")).isDisplayed()) {
			
			System.out.println("Pass");
			
			res="pass";
			}
		else {
			
			System.out.println("Fail");
			res="Fail";
			
		}
			return res;
	}
	
	
	public String AppLogon(String username , String password) {
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//validation
		
           if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed()) {
			
			System.out.println("Pass");
			
			res="pass";
			}
		else {
			
			System.out.println("Fail");
			res="Fail";
			
		}
			return res;	
		
	}
	
	public String Applogout() {
		
		driver.findElement(By.xpath("//*[@src=\"images/admin_but_03.jpg\"]")).click();
		//validation
		
        /*if(driver.findElement(By.xpath("//*[@src=\"images/Branches_but.jpg\"]")).isDisplayed()) {
			
			System.out.println("Pass");
			
			res="pass";
			}
		else {
			
			System.out.println("Fail");
			res="Fail";
			
		}
			return res;	*/
		
		return res;	
	}
 
	public void Appclose() {
		
		driver.close();
		}
	
	public static void main(String args[]) throws Exception {
		
		PrimusBank PB=new PrimusBank();
		/*//App rul
		PrimusBank PB=new PrimusBank();
		PB.AppLaunch("http://primusbank.qedgetech.com/");
		PB.Appclose();*/
		
		//AppLaunch
		PB.AppLaunch("http://primusbank.qedgetech.com/");
		PB.AppLogon("Admin","Admin");
		PB.Applogout();
		PB.Appclose();
		
		/*//Branch creation
		PB.AppLaunch("http://primusbank.qedgetech.com/");
		PB.AppLogon("Admin", "Admin");
		//Branch creation
		PB.Applogout();
		PB.Appclose();*/
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
