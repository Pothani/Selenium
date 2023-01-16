package javapractise;

import java.util.Scanner;

public class allprograms {

	public static void main(String[] args) 
	{
//		//Reverse a String
//		
//		String s1="Bhargav";
//		String s2="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//			
//		}
//		System.out.println(s2);
//		
//		
//		//Prime 0 to 100
//		
//		for(int i=0;i<=100;i++) {
//			boolean isPrime= true;
//			
//			for(int j=2;j<i-1;j++) {
//				if(i%j==0) {
//				isPrime=false;
//				break;
//				}
//			}
//			
//			if(isPrime==true) {
//				System.out.println(i+" ");
//			}
//		}
//		
//		//count of numbers
//		
//		int i =123456;
//		int reverse=0;
//		while(i!=0) {
//			int remainder=i%10;
//			reverse=reverse*10+remainder;
//			
//			i=i/10;
//			
//		}
//		System.out.println(reverse);
//		
//		//given number
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int g= sc.nextInt();
//		int j=2;
//		if(g%j==0) {
//			System.out.println("Not a prime");
//		}
//			else {
//				System.out.println(" prime");
//			}
//			
			
		
		//vowles
		
//		String s1="Bhargav is good boy";
//		int count =0;
//		char[] c=s1.toCharArray();
//		for(char t:c) {
//			
//			switch(t) {
//			case 'a':
//			case 'i':
//				
//			case 'o':
//			case 'e':
//			case 'u':
//				count++;
//				break;
//				default:
//			}
//		}
//		
//		
//		System.out.println(count);
		
		//fibnocii
		
//		int a=0,b=1,c;
//		int number=10;
//		System.out.println(a+""+b);
//		for(int i=1;i<number;i++) {
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
		//swap
		
//		int a=1,b=2,c;
//		c=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		
		//Palindrome
		
		String s="madam";
		StringBuilder sc= new StringBuilder(s);
		StringBuilder temp=sc.reverse();
		String s2=temp.toString();
		if(s.equals(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
