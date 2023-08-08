package Inheritance;

public class Hirarchical_Inheritance {
	public static void main(String[] args) {
		son1 s1= new son1();
		s1.mob();
		s1.home();
		s1.car();
		s1.proprty();
		System.out.println("========================");
		
		son2 s2=new son2();
		s2.bike();
		s2.car();
		s2.home();
		s2.proprty();
		System.out.println("=========================");
		
		son3 s3=new son3();
		s3.flat();
		s3.car();
		s3.home();
		s3.proprty();
		
	}

}
