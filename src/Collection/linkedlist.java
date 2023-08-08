package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class linkedlist {
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(200);
		l.add('A');
		l.add(null);
		l.add(200);
		
		System.out.println(l.size());
		System.out.println(l.contains(200));
		
		l.add(500);
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		l.set(2, "chavan");
		System.out.println(l);
		
		System.out.println("----Iterator------");
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("-----ListIterator----");
		
		ListIterator litr=l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("------for loop-----");
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("====for each loop----");
		for(Object s1:l)
			
		{
			
			System.out.println(l);
		}
		
		
	}

}
