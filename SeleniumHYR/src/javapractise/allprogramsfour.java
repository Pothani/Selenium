package javapractise;

public class allprogramsfour {
	
//	public static void fact(int number) {
//		
//		int 
//	}
	
	public static void main(String args[]) {
		
//	String s1="BhArGaVISagoodBOY";
//	int lower=0;
//	int upper=0;
//	for(int i=0;i<s1.length();i++) {
//		char ch= s1.charAt(i);
//		if(ch>=65&&ch<=90) {
//			upper++;
//		}
//		else {
//			lower++;
//		}
//	}
//	
//	System.out.println(lower);
//	//System.err.println(upper);
	
		
//		String s1="Bhargav";
//		for(int i=s1.length()-1;i>=0;i--) {
//			System.out.print(s1.charAt(i));
//		}
		
		//Recursive function
		
		
		
		//printnum(1);
		
		//vowles in string
		
//		String s1="Bhargavaeiou";
//		int count=0;
//		char[] ch=s1.toCharArray();
//		for(char r : ch) {
//			
//			switch(r) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//			  count++;
//			  break;
//				  default:
//			}
//		}
//		
//		System.out.println(count);
		
		
		//facttorail
		
//		int number=3;
//		int fact=1;
//		for(int i=1;i<=number;i++) {
//			fact=fact*i;
//		}
//		
//		System.out.println(fact);
		
		//reverse a number
		
//		int i= 1234567;
//		int reverse=0;
//		while(i!=0) {
//			int remainder= i%10;
//			reverse=reverse*10+remainder;
//			i=i/10;
//		}
//		System.out.println(reverse);
//		
		
		
		
		
		//duplicate 
		
		String s= "java devloper";
		int length=s.length();
		char[] ch= s.toCharArray();
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					
					System.out.println(ch[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
