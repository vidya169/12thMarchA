package method;

public class sample11 {
	
	public static void add2(int a, int b) {
		
		System.out.println("static method using parameter call by another class");
		System.out.println("addition"+ (a+b));
		
	}
	public void mult2(int a, int b) {
		System.out.println("non-static method using parameter call by another class");
		System.out.println("multiplication"+(a*b));
	}
	

}
