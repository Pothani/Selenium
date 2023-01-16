package Strings;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args)
	{
		int a=0,b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter the number");
		int d=s.nextInt();
		
		for(int i=2;i<=d;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	
		String s1=new String();
		
		
	}

}
