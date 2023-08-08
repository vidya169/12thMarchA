package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class pra_linkedlist {
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		
		li.add("vidya");
		li.add('s');
		li.add(100);
		li.add(null);
		li.add(10.25f);
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains(100));
		System.out.println(li.isEmpty());
		
		li.add(1,'V');
		li.remove(1);
		li.set(2,200);
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator litr=li.listIterator();
		while(litr.hasNext())
		{
		System.out.println(litr.next());
		}
		for(int i=0;i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}
		for(Object s1:li)
		{
			System.out.println(s1);
		}
	}

}
