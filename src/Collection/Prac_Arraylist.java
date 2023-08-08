package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

//import java.util.ArrayList;
//import java.util.ListIterator;

public class Prac_Arraylist {

	/*public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add("vidya");
		a1.add(100);
		a1.add('A');
		a1.add(20.5f);
		a1.add(null);
		a1.add(null);
		a1.add("vidya");
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.contains(100));
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(1));
		
		a1.add(3,200);
		System.out.println(a1);
		a1.remove(3);
		a1.set(2,'B');
		
		System.out.println("---------------Iterator-------------");

		 java.util.Iterator itr=a1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("---------------ListIterator----------------");
		 ListIterator litr=a1.listIterator();
		 while(litr.hasNext())
				 {
			 System.out.println(litr.next());
				 }
		 
		 System.out.println("------------forloop----------------");
		 for(int i=0; i<=a1.size()-1;i++)
		 {
			System.out.println(a1.get(i)); 
		 }
		 System.out.println("----------for each loop-----------------");

		 for(Object s1:a1)
		 {
			 System.out.println(s1);
		 }
	}
		
			
		
	} */
	
	
	
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		
		a1.add(100);
		a1.add("vidya");
		a1.add('A');
		a1.add(null);
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.contains(100));
		System.out.println(a1.isEmpty());
		
		a1.add(1,200);
		
		System.out.println(a1);
		a1.remove(2);
		a1.set(2,'B');
		a1.get(3);
		
		
		System.out.println("----------Iterator------------");
		
		java.util.Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("=========ListItrator==============");
		
		ListIterator litr=a1.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("forloop---------");
		
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("-----------for each loop------");
		
		for(Object s1:a1)
		{
			System.out.println(s1);
		}
		}
		
	}

