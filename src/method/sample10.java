package method;

public class sample10 {
	public static void main(String[] args) {
		
		add(10,20);
		sample11.add2(20, 30);
		
		System.out.println("=============================================================");
		
		sample10 s1=new sample10();
		s1.mult(10, 20);
		
		sample11 s2=new sample11();
		s2.mult2(20, 30);
		
		System.out.println("===========================================================");
		sample10 v3=new sample10();
		v3.sub(10, 2);
	
	}
public static void add(int a, int b) {
	System.out.println("static method using parameter call by same class");
	System.out.println("addition = "+(a+b));
}

public void mult(int a, int b) {
	System.out.println("not static method using parameter by same class");
	System.out.println("multiplication = "+(a*b));
}
public void sub(float a, float b)
{
	System.out.println("divisio ="+(a/b));
}
}
