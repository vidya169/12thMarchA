package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class vector {
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("vidya");
		v.add('v');
		v.add(100);
		v.add(null);
		
		System.out.println(v.size());
		System.out.println(v.equals(1));
		
		v.add(111);
		System.out.println(v);
		
		v.remove(4);
		System.out.println(v);
		
		v.set(2,'s');
		System.out.println(v);
		
		System.out.println("------Iterator-----");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------List Iterator-----");
		ListIterator litr=v.listIterator();
				while(litr.hasNext())
				{
					System.out.println(litr.next());
				}
				
	     System.out.println("-------for loop----------");
	     for(int i=0; i<=v.size()-1;i++)
	     {
	    	 System.out.println(v.get(i));
	     }
	     
	     System.out.println("------for each loop------");
	     for(Object s1:v)
	     {
	    	 System.out.println(v);
	     }
	     System.out.println("-----Enumerator-------");
	     Enumeration enu=v.elements();
	     while(enu.hasMoreElements())
	     {
	    	 System.out.println(enu.nextElement());
	    	 
	     }
				}
		
	}


