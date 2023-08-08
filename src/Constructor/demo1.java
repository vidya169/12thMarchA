package Constructor;
/*
public class demo1 {
	
	int num1;
	int num2;
	
	demo1(int a,int b)
	{
		num1=a;
		num2=b;
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
	
	
	demo1 s1=new demo1(10, 20);
			s1.addition();
			s1.multiplication();
			
			
			System.out.println("===================");
			
			demo2 s2=new demo2(10, 40);
			s2.substraction();
	}
	
	
	

}*/

public class demo1 {
	
	int num1;
	int num2;
	
	demo1(int a, int b){
		num1=a;
		num2=b;
	}
	public void addiion()
	{
		System.out.println(num1+num2);
	}
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args)
	{
		demo1 s1=new demo1(10,20);
		s1.multiplication();
		s1.addiion();
		System.out.println("==============================");
		
		demo1 s2=new demo1(30,40);
		s2.addiion();
				
	}
}
