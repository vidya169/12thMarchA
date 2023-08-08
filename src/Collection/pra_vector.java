package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class pra_vector {
	public static void main(String[] args)
	{
		Vector s=new Vector();
		s.add("shantanu");
		s.add('S');
		s.add(100);
		s.add(10.50f);
		s.add(null);
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains(100));
		System.out.println(s.isEmpty());
		
		s.add(2,'V');
		s.add(3,'V');
		s.remove(3);
		s.set(1, 'H');
		s.get(0);
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator litr=s.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		for(int i=0;i<=s.size()-1;i++)
		{
			System.out.println(s.get(i));
		}
		for(Object c1:s) {
			
			System.out.println(c1);
			
		}
		Enumeration en=s.elements();
		while(en.hasMoreElements())
		{
		System.out.println(en.nextElement());	
		}
		
		
			
		
	}
}
