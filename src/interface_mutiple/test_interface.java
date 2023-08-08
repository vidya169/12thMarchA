package interface_mutiple;

public class test_interface implements interface1, interface2
{


	public void m3() 
	{
	System.out.println("abc");
		
	}

	
	public void m4() {
		System.out.println("xyz");
		
		
	}

	
	public void m1() {
		System.out.println("pqr");
		
		
	}

	public void m2() {
		System.out.println("vvv");
		
	}
	
	public static void main(String[] args) {
		 test_interface s1= new  test_interface ();
		 s1.m1();
		 s1.m2();
		 s1.m3();
		 s1.m4();
		
	}

}
