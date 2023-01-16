package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAlerts {

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\SeleniumHYR\\CommonJarFiles\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
    
     //alert
     
//     driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//     driver.switchTo().alert().accept();
//     System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//     Thread.sleep(3000);
//     driver.quit();
//     
     //confirm alert
     
//     driver.findElement(By.id("confirmBox")).click();
//     driver.switchTo().alert().dismiss();
//     System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
//     Thread.sleep(3000);
//     driver.quit();
    
     //prompt alert
     
     driver.findElement(By.id("promptBox")).click();
     driver.switchTo().alert().sendKeys("Bhargav");
     driver.switchTo().alert().accept();
     System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
     Thread.sleep(3000);
     driver.quit();
	}

}
