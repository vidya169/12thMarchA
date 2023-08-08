package method;

public class sample6 {
	public static void main(String[] args) {
		vs1();  //static same class
		
		sample7.vs2(); //static diff class
		
		System.out.println("-------------------------------------------------------------");
		
		sample6 vidya=new sample6();  //non-static same class
		vidya.vs3();
		
		sample7 vidya1=new sample7();   //non-static diff class
		vidya1.vs4();
		
		
		
	}
  //static regular method
	public static void vs1()
	{
	System.out.println("static regular method call by main method frm same class");	
	}
	
	//non-static regular method
	public void vs3()
	{
		System.out.println("non-static regular method call by main methd from diffrent class");
	}
}
