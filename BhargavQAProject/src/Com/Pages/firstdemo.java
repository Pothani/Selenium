package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\CommonJarFiles\\geckodriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		//First text box
		WebElement tb1 =d.findElement(By.id("firstName"));
		
		if(tb1.isDisplayed()) {
			
			tb1.sendKeys("Bhargav");
		}
		else
		{
			System.out.print("Is not displyed");
		}
		

		//second box
		
		WebElement tb2= d.findElement(By.name("lName"));
		
		if(tb2.isDisplayed()) {
			
			tb2.sendKeys("Pothani");
		}
		
		
		
		
	}

}
