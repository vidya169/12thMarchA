package polymorphism;

//using static method just for try

public class Child extends Parent {
	
	static int i = 10;
	
	public static void vidya()
	{
	System.out.println("Property: 2cr");
	}
	
	public static void chavan()
	{
	System.out.println("Property: 2cr");
	}
	
	
	
	public static void main(String[] args) {
	
	Parent p = new Child();       //upcasting object creating way
	p.vidya();                   // Parent's static method 
	//System.out.println(p.i);     // Parent variable
	
	Child c = new Child();
	c.vidya();
	c.chavan();              // Child static method 
	//System.out.println(c.i);    //child variable
	
	Parent pp = new Parent();
	pp.vidya();                  // Parent Static method 
	//System.out.println(pp.i);    // Parent variable
	
	vidya();                   // Child static method 
	//System.out.println(i);     // Child variable
	}
	}


