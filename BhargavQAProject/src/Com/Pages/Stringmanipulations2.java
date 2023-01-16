package Com.Pages;

public class Stringmanipulations2 {

	public static void main(String[] args) {
	
		String s1="Bhargav_is_a_cool_guy_c";
		
		//System.out.println(s1.length());
		
		//System.out.println(s1.indexOf("a"));//1st Occurance
		
		//System.out.println(s1.indexOf("a",s1.indexOf("a")+1));
		
		//System.out.println(s1.indexOf("c"));
		
		//System.out.println(s1.indexOf("c",s1.indexOf("c")+1));
		
		/*String s="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			s=s+s1.charAt(i);
		}
		
		System.out.println(s);*/
		/*
		System.out.println(s1.replace("B", "N"));
		
		System.out.println(s1.trim());*/
		
		String test[]=s1.split("_");
		
		for(int i=0;i<test.length;i++) {
			
			System.out.println(test[i]);
		}
		

	}

}
