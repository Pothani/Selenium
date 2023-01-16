package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\SeleniumHYR\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		driver.findElement(By.xpath("//a[@class='nav-a'][1]")).click();
//		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Bhargav");
//		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9098909890");
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("bhargav2190@gmail.com");
//		driver.findElement(By.xpath(" //input[@id='ap_password']")).sendKeys("123456789");
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
//		System.out.println("Registration is success");
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
