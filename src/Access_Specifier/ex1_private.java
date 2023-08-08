package Access_Specifier;
/*
public class ex1_private {
	
	private int a;
	private int b;
	
	 ex1_private()
	 {
	 a=10;
	 b=20;
	
	 }
	private void m1()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		
		ex1_private s1=new  ex1_private();
		s1.m1();
				
	}

}
*/

public class ex1_private 
{
	private int a;
	private int b;
	
	ex1_private()
	{
		a=10;
		b=20;
		
	}
	private void m1()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
		ex1_private s1=new ex1_private();
		s1.m1();
	}
}