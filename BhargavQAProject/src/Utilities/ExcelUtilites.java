package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilites 
{
	//Interface which is used for instantiate Excel sheet(Xlxs,xls)
	Workbook wb;
	
	//This constructor will load the excel inputsheet
	
	public ExcelUtilites() throws Exception
	{
		
		FileInputStream fis= new FileInputStream("C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\TestInputs\\InputSheet.xls"); 
			wb=WorkbookFactory.create(fis);
		
	}
	
	//rowcount
	public int rowCount(String sheetname) 
	{
		
		return wb.getSheet(sheetname).getLastRowNum();
	}
	 //cloumncount
	public int columnCount(String sheetname,int row) 
	{
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	//Reading
	
	public String getdata(String sheetname,int row,int coulmn) 
	{
	    String data="";
		if(wb.getSheet(sheetname).getRow(row).getCell(coulmn).getCellType()==CellType.NUMERIC) 
		{
		
			//double date converted into int
			int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(coulmn).getNumericCellValue();
			
			//int to string
			data=String.valueOf(celldata);
		}
		else 
		{
			data =wb.getSheet(sheetname).getRow(row).getCell(coulmn).getStringCellValue();	
		}
		return data;
	}
	
	//store data into excel file pass or fail and not executed
	
	public void setdata(String sheetname,int row,int coulmn,String status) throws Exception 
	{
		
		Sheet sh=wb.getSheet(sheetname);
		Row rownum =sh.getRow(row);
		Cell cell=rownum.createCell(coulmn);
		cell.setCellValue(status);
		
		if(status.equalsIgnoreCase("PASS")) 
		{
		    //create cell style
			
			CellStyle style= wb.createCellStyle();
			
			//create font
			
			Font font=wb.createFont();
			
			//applyng colour to text
			
			font.setColor(IndexedColors.GREEN.getIndex());
			
			//apply bold to text
			
			font.setBold(true);
			
			//set font
			
			style.setFont(font);
			
			//set cell style'
			
			rownum.getCell(coulmn).setCellStyle(style);
		}else if(status.equalsIgnoreCase("FAIL"))
		{
            //create cell style
			
			CellStyle style= wb.createCellStyle();
			
			//create font
			
			Font font=wb.createFont();
			
			//applyng colour to text
			
			font.setColor(IndexedColors.RED.getIndex());
			
			//apply bold to text
			
			font.setBold(true);
			
			//set font
			
			style.setFont(font);
			
			//set cell style'
			
			rownum.getCell(coulmn).setCellStyle(style);
			
		}
		else 
			if(status.equalsIgnoreCase("NOT EXECUTED"))
			{
				//create cell style
				
				CellStyle style= wb.createCellStyle();
				
				//create font
				
				Font font=wb.createFont();
				
				//applyng colour to text
				
				font.setColor(IndexedColors.BLUE.getIndex());
				
				//apply bold to text
				
				font.setBold(true);
				
				//set font
				
				style.setFont(font);
				
				//set cell style'
				
				rownum.getCell(coulmn).setCellStyle(style);
				
			}
		
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\TestOutput\\Outputsheet.xls");
		
		wb.write(fos);
		
		fos.close();
	}
	
	
	public static void main(String args[]) throws Exception 
	{
		
		ExcelUtilites excel =new ExcelUtilites();
		//System.out.println(excel.rowCount("MasterTestCases"));
		//System.out.println(excel.getdata("MasterTestCases", 1, 1));
		
		System.out.println(excel.columnCount("ApplicationLogin", 2));
		
		System.out.println(excel.getdata("ApplicationLogin", 3, 3));
	}	
	
}
	 
	 
	 
	
	 
	 
	 
	 

