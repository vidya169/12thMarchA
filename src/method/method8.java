package method;

public class method8 {

	//with parameter
	
	public static void main(String[] args) {
		
		  
		addition(2,2);//static regular
		substraction(11,20);  //static regular
		
		System.out.println("==============================================");
		
		method8 vc=new method8();  //non static
		vc.multiplication(2,2);
		
		
	}
	
	public static void addition(int a,int b)
	{
	int sum=a+b;
	
	System.out.println("addition = "+sum);
	
	}
	public static void substraction(int a,int b) {
		
		int sum=a-b;
		
		System.out.println("substraction = "+sum);
		
	}
	//non static method with parameter
	
	public void multiplication(int a, int b) {
		int sum=a*b;
		System.out.println("multiplication = "+sum);
		
	}
}
