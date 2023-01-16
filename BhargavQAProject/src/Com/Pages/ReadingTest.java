package Com.Pages;

	import java.io.FileInputStream;
	import java.util.Properties;

	import Utilities.PropertyFileUtil;

	public class ReadingTest 
	{

		public static void main(String[] args) throws Exception 
		{
			Properties con= new Properties();// creating the object

			FileInputStream fis=new FileInputStream("C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\PropertiesFile\\Environment.properties");
			//To read the data
			
			con.load(fis);//To Read the data
			
			System.out.println(con.getProperty("Browser"));//To get the key and valuses
			
			System.out.println(con.getProperty("URL"));
			
			System.out.println(con.getProperty("UserName"));
			
			System.out.println(con.getProperty("Password"));
			
			
		}

	}
	

