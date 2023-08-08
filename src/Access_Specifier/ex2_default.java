package Access_Specifier;
/*
public class ex2_default {
	int a=10;
	int b=20;
	
	/*ex2_default()
	{
	a=10;
	b=20;
	} *//*
	 void m1() {
		 System.out.println(a-b);
	 }
public static void main(String[] args) {
	ex2_default s1=new ex2_default();
	s1.m1();
	
}
}
*/
public class ex2_default {
	int a=10;
	int b=20;
	void m1()
	{
		System.out.println(a-b);
	}
	public static void main (String[] args)
	{
		ex2_default s1=new ex2_default();
				s1.m1();
	}
}