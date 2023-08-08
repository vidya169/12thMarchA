package Abstract_Cocrete_Class;

//concrete class
//in this class we can completes incomplete method
/*
public class sample2 extends sample1 {
	public void m2()
	{
		System.out.println("complted abstract method");
	}
	public void m3()
	{
		System.out.println("cmplete abstract method");
	}
	
	public static void main(String[] args) {
		
		sample2 s1=new sample2();
		s1.m2();
		s1.m3();
		s1.m1();
		
	}

}
*/
public class sample2 extends sample1{

	@Override
	public void m2() {
		System.out.println("complete abstract method m2");
		
	}

	@Override
	public void m3() {
		System.out.println("complete abstract method m3");
		
	}
	
	public static void main(String[] args) {
		sample2 s1=new sample2();
		s1.m1();
		s1.m2();
		s1.m3();
	}
	
	
	
	
	
	
	
}