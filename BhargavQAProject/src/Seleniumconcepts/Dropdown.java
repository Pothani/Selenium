package Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\CommonJarFiles\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.xpath("//select[@name=’selType’]")));
	      // select an option by value method
	      s.selectByValue("name");
	      Thread.sleep(1000);
	      // select an option by index method
	      s.selectByIndex(0);
	      Thread.sleep(1000);
	      // select an option by visible text method
	      s.selectByVisibleText("By Subject");
	      Thread.sleep(1000);
	      driver.quit();

	}

}
