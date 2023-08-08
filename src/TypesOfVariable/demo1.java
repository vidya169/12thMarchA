package TypesOfVariable;

public class demo1 {
	
static int a=10;                  // we cam call globle variable in printing statement 
	                                   //and globale static varible can call any method means we can call in main method,static method,non static
	public static void main(String[] args) {
		
		System.out.println(a);        //globale static method callfrom same class
		System.out.println("==========================================");
		System.out.println(demo2.b);  //globle static method call rom another class...
		
	}
	
	public static void v1() {
		System.out.println(a);
	}
	
	public void v2() {
		System.out.println(a);
	}  

	
	
	
	
	
	
	
	
}
