package javapractise;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		
	String name="This is a first program";
	
	int i = name.length();
	
	String rev="";
	
	for(int j=name.length()-1;j>=0;j--)
	{
		rev= rev+name.charAt(j);
	}
	

	System.out.println(rev);
	}
}
