package Com.Pages;

import java.util.Random;

public class ReverseString {

	public static void main(String[] args) {
		
		
		/*String s="Vishal";
		String s2="";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);*/
		
		long n=123456;
		int r=0;
		while(n!=0) 
		{
			
			int t=(int) (n%10);
			n=n/10;
		r=r*10+t;
		}
		System.out.println("Reversed"+r);
}
}


