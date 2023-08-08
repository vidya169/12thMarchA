package TypesOfVariable;

public class demo6 {
	
	static int b=20;
	int d=40;
	public static void main(String[] args) {
		int a=10;
		
		System.out.println("value= "+a);    //local variable
	
		
		
		System.out.println("===================================");
		
		System.out.println("value= "+b);  //globle static from same class
		System.out.println(demo7.c);  //globle static from another class
		
		System.out.println("===============================");
		
		demo6 v1=new demo6();   //non static globle from same class
		System.out.println(v1.d);
		
		demo7 v2=new demo7();    //non static globale method from another class
		System.out.println(v2.f);
		
		
		
	}
	


}
