package javapractise;

public class recursive {
	
	public static void printNum(int num) {
         
		if(num<100) {
			System.out.println(num);
			num++;
			
		}

	}

	public static void main(String[] args) {

		printNum(1);
		
		
//		int i=12345;
//		int reverse=0;
//		while(i!=0){
//		   int remainder= i%10;
//		   reverse=reverse*10+remainder;
//		   i=i/10;
//		 
//		}
//		System.out.println(reverse);

	}

}
