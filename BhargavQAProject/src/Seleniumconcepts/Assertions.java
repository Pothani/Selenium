package Seleniumconcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assertions
{
	
	SoftAssert s= new SoftAssert();
	
	public void demo() {
		
		System.out.println("welcome");
		s.assertEquals(true, false);//Hard Assertion means next corrresponding lines wont be exceuted imediatley test case will be terminated
		
		System.out.println("To the world");
		System.out.println("GHRMS");
		System.out.println("VAsu deva");
		
		
		System.out.println("Go to contact page");
		System.out.println("Go to registration page");
		
	}
	
	
	

}
