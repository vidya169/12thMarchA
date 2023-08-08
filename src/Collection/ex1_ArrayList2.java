package Collection;

import java.util.ArrayList;

public class ex1_ArrayList2 {
	public static void main(String[] args)
	{		
		//ArrayList al=new ArrayList(15);   //initial capacity =15 --> resizable
		
		ArrayList al=new ArrayList(); //by default capacity =10
		al.add("ganesh");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add("ganesh");
		al.add(null);
		al.add(null);
		
		
		System.out.println(al);  //[ganesh 100 A 65.5]
		System.out.println(al.size());
		System.out.println(al.isEmpty());   //false
		System.out.println(al.contains(100));  //true
		System.out.println(al.get(1));  //100
		
		System.out.println(al);
		
		//add/insert info in between arraylist   --> right shift operation
		al.add(4,500);  
		System.out.println(al);
		
		
		//remove/delete info in between arraylist  --> left shift operation
		al.remove(4);		
		System.out.println(al);
		
		
		//update or modify
		al.set(3, 75.5);
		System.out.println(al);
				
	}

}
