package TypesOfVariable;

public class demo3 {
	int a=10;
	
	public static void main(String[] args) {
		demo3 s1=new demo3();    //globle static variable call from same class
		System.out.println(s1.a);
		System.out.println("========================================");
		dmo4 s2=new dmo4();    //global non static variable call from another class
		System.out.println(s2.b);
		}
	
	public static void v1()                   //static method
	{
		demo3 s2=new demo3();                        
		System.out.println(s2.a);
	}
	public void v2()                   //non static
	{
		System.out.println(a);
	}
	

}
