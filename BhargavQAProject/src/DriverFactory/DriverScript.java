package DriverFactory;

import org.openqa.selenium.WebDriver;

import CommonFunctionLibrary.FunctionLibrary;
import Utilities.ExcelUtilites;

public class DriverScript
{
	WebDriver driver;

	public void startTest() throws Exception 
	{
		ExcelUtilites excel=new ExcelUtilites();
		
		for(int i=1;i<=excel.rowCount("MasterTestCases");i++) 
		{
		
			String modulestatus="";
			if(excel.getdata("MasterTestCases", i, 2).equalsIgnoreCase("Y"))
			{
				
			String TCModule=excel.getdata("MasterTestCases", i, 1);
			
			
			int rowcount=excel.rowCount(TCModule);
			
			for(int j=1;j<=rowcount;j++) 
			{
				String Description =excel.getdata(TCModule, j, 0);
				
				String Object_Type=excel.getdata(TCModule, j, 1);
				
				String Locator_Type=excel.getdata(TCModule, j, 2);
				
				String Locator_Value=excel.getdata(TCModule, j, 3);
				
				String Test_Data=excel.getdata(TCModule, j, 4);
				
				//excel.getdata(TCModule, j, 5);
				try {
				if(Object_Type.equalsIgnoreCase("startBrowser")) 
				{
					
					driver=FunctionLibrary.startBrowser(driver);
				}
				
				if(Object_Type.equalsIgnoreCase("openApplication")) 
				{
					
					FunctionLibrary.openApplication(driver);
				}
				
				if(Object_Type.equalsIgnoreCase("clickAction")) 
				{
					
					FunctionLibrary.clickAction(driver, Locator_Type, Locator_Value);
				}
				
				if(Object_Type.equalsIgnoreCase("typeAction")) 
				{
					
					FunctionLibrary.typeAction(driver, Locator_Type, Locator_Value, Test_Data);
				}
				
				if(Object_Type.equalsIgnoreCase("closeBrowser")) 
				{
					
					FunctionLibrary.closebrowser(driver);
				}
				
				if(Object_Type.equalsIgnoreCase("waitForElement")) 
				{
				
					FunctionLibrary.waitForElement(driver, Locator_Type, Locator_Value, Test_Data);
				}
				
				if(Object_Type.equalsIgnoreCase("mouseClick"))
				{
					FunctionLibrary.mouseClick(driver);
				}
				
				/*if(Object_Type.equalsIgnoreCase("alert"))
				{
					FunctionLibrary.alert(driver, Locator_Type, Locator_Value);
				}*/
				excel.setdata(TCModule, j, 5, "PASS");//Step Results
				modulestatus="true";
				}
				catch(Exception e) 
				{
					excel.setdata(TCModule, j, 5, "FAIL");
					modulestatus="false";
					break;
					
				}
			}
			}
			if(modulestatus.equalsIgnoreCase("true"))
			{
				excel.setdata("MasterTestCases", i, 3, "PASS");//Module status or test case status
			}
			else
				if(modulestatus.equalsIgnoreCase("false")) 
				{
					excel.setdata("MasterTestCases", i, 3, "FAIL");
				}
				else
				{
					excel.setdata("MasterTestCases", i, 3, "Not Executed");
				}
			}
		}
	}
	

