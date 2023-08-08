package Constructor;

public class sample1 {
	
	/*
	 * sample()
	 *{                 //defult constructor
	 *
	 *}
	 */
	
	public static void main(String[] args) {
		
		sample1 s1=new sample1();
		s1.v1();
		s1.v2();
		
		System.out.println("=================================");
		sample2 s2=new sample2();
		s2.v3();
		s2.v4();
		
		
	}
	
	public void v1() {
		System.out.println("running method m1");
	}
	public void v2() {
		System.out.println("running method m2");
	}

}
