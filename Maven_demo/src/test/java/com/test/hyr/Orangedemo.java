package com.test.hyr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangedemo 
{
	WebDriver driver;
	
	@Test
	public void OpenUrl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		}
	

	@Test
	public void Loginapp() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bhargav2194@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("8143230137");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//driver.quit();
		}
	
	@Test
	public void Logout() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("bhargav2194@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("8143230137");
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(3000);
		driver.findElement(By.className("_2s25")).click();
		driver.quit();
		
		}
	

}
