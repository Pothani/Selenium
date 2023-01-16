package javapractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.support.ui.WebDriverWait;

public class allprogramstwo {

	public static void main(String[] args) throws FileNotFoundException {


//		//Reverse a Strig
//		
//		String s1="Bhargav rerw";
//		String str="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			str=str+s1.charAt(i);
//		}
//		System.out.println(str);
//		
//		//Reverse a number
//		
//		int number=12345;
//		int reverse=0;
//		while(number!=0) {
//			
//			int remainder= number%10;
//			reverse=reverse*10+remainder;
//			number=number/10;
//		}
//		
//		System.out.println(reverse);
//		
//		
//		//vowles in string
//		
//		String vowls="Bhargav is good boy aeiou";
//		int count=0;
//		char[] c= vowls.toCharArray();
//		for(char g :c) {
//			
//			switch(g) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				count++;
//				break;
//				default:
//			}
//		}
//		
//		
//		System.out.println(count);
//		
//		//prime number 0 to 100
//		
//		for(int i=0;i<=100;i++) {
//			
//			boolean isPrime=true;
//			for(int j=2;j<i-1;j++) {
//				if(i%j==0) {
//					isPrime=false;
//					break;
//				}
//			}
//			
//			if(isPrime==true) {
//				System.out.print(i+" ");
//			}
//		}
//		
//		//palindromw
//		
//		String pali="madam";
//		StringBuilder sc= new StringBuilder(pali);
//		StringBuilder temp= sc.reverse();
//		String pali2=temp.toString();
//		if(pali.equals(pali2)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("not a Palindrome");
//		}
//		//fact
//		
//		int n1=3;
//		int fact=1;
//		for(int i=1;i<=n1;i++) {
//			fact=fact*i;
//			
//		}
//		System.out.println(fact);
		
		//fibnocii
		
//		int a=0, b=1 ,c;
//		int num=5;
//		System.out.print(a+" "+b+" ");
//		for(int i=0;i<=num;i++) {
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//			
//		}
//		
		
		
//		String s1="Bhargava";
//		System.out.println(s1.indexOf('a')+1);
//		
//		System.out.println(s1.indexOf('a',s1.indexOf('a')+1));// second occrance
//		
//		String str="vikas";
//		String str1="Bharg";
//		System.out.println(str.equals(str1));
		
		//swap
		
//		int a=100, b=200 ;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		
		
		//
		
	//	To read a data from excel sheet
		
//		FileInputStream fis = new FileInputStream("path of excel");
//		Workbook wb = workbookfactory.create(fis);
//		sheet s = wb.getsheet("sheet name");
//		String vlue= s.getRow(rowNum).getCell(cellNum).getStringCellvalue();
		
		
		for(int i=0;i<=100;i++) {
			
			boolean isprime=true;
			
			for(int j=2;j<i-1;j++) {
				
				if(i%j==0) {
					isprime=false;
					break
					;
				}
			}
			
			if(isprime==true) {
				
				System.out.println(i);
			}
		}
	
		
		int a=100,b=200,c;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
