package method;

public class sample4 {
	public static void main(String[] args) {
		//non static regular method call from same class
		sample4 s1=new sample4();
		s1.a1();
		s1.a2();
		
		System.out.println("======================================");
		//non static regular method call from difrent class
		sample5 s2=new sample5();
		s2.a3();
		s2.a4();
		
	}
	public void a1() {
		System.out.println("non static regular method");
	}
	public void a2() {
		System.out.println("non static method call by main method from same class");
	}

}
