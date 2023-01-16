package javapractise;

public class allprogramsthree {

	public static void main(String[] args) {
		
		

       //upper and lowercase letters
		
//		String s1="BhArGaVvrtr";
//		String lower="";
//		String upper="";
//		for(int i=0;i<s1.length();i++) {
//			char ch= s1.charAt(i);
//			if(ch>=65 && ch<=90) {
//				
//				upper=upper+ch;
//			}
//			else {
//				
//				lower=lower+ch;
//			}
//		}
//		
//		System.out.println(lower);
//		System.out.println(upper);
		
		
		//reverse a string
		
//		String s1="Bhargav";
//		for(int i=s1.length()-1;i>=0;i--) {
//			System.out.print(s1.charAt(i));
//		}


//		String s1="Bhargav is good boy";
//		String[] parts=s1.split(" ");
//		for(int i=parts.length-1;i>=0;i--) {
//			System.out.print(parts[i]+" ");
//		}
		
		//reverse a number
		
//		int i=1234567;
//		int reverse=0;
//		while(i!=0) {
//			int remainder= i%10;
//			reverse=reverse*10+remainder;
//			i=i/10;
//		}
//		
//		System.out.println(reverse);


		//palindrome
		
//		String s1="erer";
//		StringBuilder sc= new StringBuilder(s1);
//		StringBuilder temp=sc.reverse();
//		String s2=temp.toString();
//		if(s1.equals(s2)) {
//			System.out.println("Palindorme");
//		}
//		else {
//			System.out.println("Not");
//		}
		
		//Prime number 0 to 100
		
//		for(int i=0;i<=100;i++) {
//			
//			boolean isPrime=true;
//			
//			for(int j=2;j<i-1;j++) {
//				
//				if(i%j==0) {
//					isPrime=false;
//					break;
//				}
//				
//			}
//			
//			if(isPrime==true) {
//				System.out.print(i+" ");
//			}
//			
//		}
		
		//fact
		
//		int num= 6;
//		int fact=1;
//		for(int i=1;i<=num;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
		//fibnocii
		
//		int a=0,b=1,c;
//		int num=9;
//		System.out.print(a+" "+b+" ");
//		for(int i=2;i<num;i++) {
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//		}
		
		
		//swap
		
//		int a=100, b=200;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.print(a);
//		System.out.print(b);
		
		
//		int a=56,b=30;
//		
//		int large= a>b?a:b;
//		System.out.println(large);
//		
		//count of string
		
//		String s1="Bhargav";
//		int count=0;
//		for(int i=0;i<s1.length();i++)
//		{
//			count++;
//		}		
//		System.out.println(count);
		
		//
		
//		String s1="bhargav iS a good boy";
//		String[] parts=s1.split(" ");
//		for(int i=0;i<s1.length();i++) {
//			
//			char[] c=parts[i].toCharArray();
//			for(int j=0;j<c.length;j++) {
//				c[0]=Character.toUpperCase(c[0]);
//				System.out.print(c[j]);
//			}
//			System.out.print(" ");
//		}
		
		
		//vowels
		
//		String s1="Bhargav is gpood boy aeiou";
//		int count=0;
//		char[] ch = s1.toCharArray();
//		for(char vo:ch) {
//			switch(vo) {
//			
//			case 'a':
//			case 'e':
//				
//			case 'i':
//			case 'o':
//			case 'u':
//				count++;
//					break;
//				default:
//			}
//		}
//		
//		System.out.println(count);
		
		String s="VALUELABSA";
		
		char[] ch= s.toCharArray();
		for(char c : ch) {
			if(c=='A') {
				System.out.print("1");
			}
			else {
				System.out.print(c);
			}
			
		}
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	


}
