package DriverFactory;

import org.testng.annotations.Test;

public class AppTest extends DriverScript
{
	@Test
	public void kickstart() throws Exception 
	{
		AppTest ds=new AppTest();
		try
		{
		     ds.startTest();
		}catch(Exception e) 
		{
			e.printStackTrace();
			
		}
	}
}
