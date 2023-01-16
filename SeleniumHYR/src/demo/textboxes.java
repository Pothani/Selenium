package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\SeleniumHYR\\CommonJarFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Radiobutton link and buttons
		
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement Hindi= driver.findElement(By.id("hindichbx"));
		Hindi.click();
		
		if(Hindi.isSelected()) {
			
			Hindi.click();
		}
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("navigateHome")).click();
		
		
	}
}

