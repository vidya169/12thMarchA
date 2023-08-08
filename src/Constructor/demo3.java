package Constructor;

import javax.swing.Spring;

/*
public class demo3 {
	
	int num1;
	int num2;
	String name;
	 //using multiple cunstroctor
	//cunstuctor without using parameter
	demo3()
	{
		num1=10;
		num2=20;
	}
	//cunstroctor using parameter(int int)
	
	demo3(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	//using parameter (string)
	demo3(String c)
	{
		name=c;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	public void name() {
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		demo3 s1 =new demo3();
				s1.add();
				
	System.out.println("============");	
	
	demo3 s2=new demo3(20,30);
	s2.mult();
	
	System.out.println("=================");
	demo3 s3=new demo3("vidya");
			s3.name();
			
	System.out.println("================");
	demo4 s4=new demo4(6,4);
			s4.sub();
	}

} */

public class demo3
{
	int num1;
	int num2;
    String num3;
    
    demo3()
    {
    	num1=10;
    	num2=20;
    	
    	
    }
    demo3(int a,int b)
    {
    	num1=a;
    	num2=b;
    }
    demo3(String c)
    {
    	num3=c;
    	
    }
    public void add()
    {
    	System.out.println(num1+num2);
    }
    public void sub()
    {
    	System.out.println(num1-num2);
    }
    public void val()
    {
    	System.out.println(num3);
    }
    public static void main(String[] args)
    {
    	demo3 s1=new demo3(10,20);
    		s1.add();
    		s1.sub();
    	
    
    demo3 s4=new demo3("vidya");
    s4.val();
   
    
}
}
