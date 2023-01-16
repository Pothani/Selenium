package javapractise;

public class methodOverloading {
	
	public void printsalary(int sal) {
		
		System.out.println(sal);
		
	}
	
    public void printsalary(int sal,String d) {
		
		System.out.println(sal+ d);
		
	}


	public static void main(String[] args) {
 
		methodOverloading md= new methodOverloading();
		md.printsalary(1000);
		md.printsalary(23, "Bhargav");
       

	}

}
