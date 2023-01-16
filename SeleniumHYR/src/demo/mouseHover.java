package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\SeleniumHYR\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
 
		

	}

}
