package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_pra{
	public static void main(String[] args)
	{
		
		LinkedHashSet h=new LinkedHashSet();
		h.add("vidya");
		h.add(200);
		h.add('A');
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(1));
		
		System.out.println(h.add(500));
		System.out.println(h.remove(2));
		
		System.out.println("---Iterator------");
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----for each loop------");
		for(Object s1:h)
		{
			System.out.println(h);
			
		}
	}

}
