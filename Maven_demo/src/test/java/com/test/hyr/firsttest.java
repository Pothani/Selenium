package com.test.hyr;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttest 
{

	@Test


	//	public void fb()
	//	{
	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver= new ChromeDriver();
	//		driver.manage().window().maximize();
	//		driver.get("https://www.google.com/");
	//		driver.findElement(By.name("q")).sendKeys("HYR tutorials" ,Keys.ENTER);
	//		System.out.println(driver.getTitle());
	//		
	//		String Expected= "HYR tutorials - Google Searchss";
	//		String Actual = driver.getTitle();
	//		assertEquals(Actual, Expected ,"title mismatched");
	//		
	//		driver.quit();
	//
	//
	//	}


	public void asserts() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("HYR tutortial" ,Keys.ENTER);
		Thread.sleep(4000);
		

		//title
		
		SoftAssert asserts=new SoftAssert();

		String Expected ="Log in to Facebookff";
		String Actual =driver.getTitle();
		asserts.assertNotEquals(Actual, Expected ,"title mismatched");

		//URL

		String expectedUrl ="https://www.facebook.com/";
		String actualUrl =driver.getCurrentUrl();
		asserts.assertNotEquals(actualUrl, expectedUrl ,"URL mismatched");
		driver.quit();
		asserts.assertAll();
		
		//Texta
		
//		String expectedtext =driver.findElement(By.id("email")).getAttribute("value");
//		String actualtext ="";
//		assertEquals(actualtext, expectedtext ,"text mismatched");

		
	}

	






}
