package demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testFrame {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\SeleniumHYR\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.findElement(By.id("name")).sendKeys("Bhargva");
//		
//		driver.switchTo().frame("frm1");//frame1
//		Select countrydropdown = new Select(driver.findElement(By.id("course")));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		countrydropdown.selectByVisibleText("Java");
//		driver.switchTo().defaultContent();//main page
//		driver.findElement(By.id("name")).sendKeys("NBjdas");
//		driver.close();
		
		driver.get("https://amazon.com");
		
		List<WebElement> lists= driver.findElements(By.tagName("a"));
		System.out.println(lists.size());
		
		for(WebElement link : lists){
			
			String linkurl = link.getAttribute("href");
			URL url = new URL(linkurl);	
			
			URLConnection urlconnection=url.openConnection();
			
			
		}
		
		

	}

}
