package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\SeleniumHYR\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//sinngle winode
		
//		driver.findElement(By.id("newWindowBtn")).click();
//		
//		String Parentwindowhandle =driver.getWindowHandle();
//		System.out.println("Parent window"+Parentwindowhandle);
//		Set<String> windowhanldes= driver.getWindowHandles();
//		for(String windowhandle :windowhanldes ) {
//			if(!windowhandle.equals(Parentwindowhandle)) {
//				
//				driver.switchTo().window(windowhandle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("email")).sendKeys("Bhargav.com");
//				Thread.sleep(4000);
//				driver.close();
//			}
//		}
//		
//		driver.switchTo().window(Parentwindowhandle);
//		driver.findElement(By.id("name")).sendKeys("Bhargav");
//		Thread.sleep(2000);
//		driver.quit();
		
		//singletab
		
		driver.findElement(By.id("newTabBtn")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window"+parentwindow);
		Set<String> childwindows=driver.getWindowHandles();
		for(String windowhandle:childwindows) {
			if(!windowhandle.equals(parentwindow)) {
				
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("alertBox")).click();
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("Bhargva");
		driver.close();
		
		//final conclusion
		
		// driver.getwindowHandle();
		//driver.getwindowHandles();
		//drvier.swithto.window();
		
	}

}
