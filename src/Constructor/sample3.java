package Constructor;

public class sample3 {
	
	int num1;
	int num2; 
	
	sample3()
	{
	
	 num1=10;
	num2=20;
	}
	
	public void addition()
	{
		System.out.println(num1+num2);
	}
	 public void multiplication()
	 {
		 System.out.println(num1*num2);
	 }
	
	
	
	public static void main(String[] args) {
		
		sample3 s1=new sample3();
		s1.addition();
		s1.multiplication();
		 System.out.println("====================================");
		 sample4 s2=new sample4();
		 s2.substraction();
				
				
		
	}
	


}
