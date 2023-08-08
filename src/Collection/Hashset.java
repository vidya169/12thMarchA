package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args)
	{
		HashSet h=new HashSet();
		
		h.add("vidya");
		h.add(200);
		h.add('A');
		h.add(null);
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		h.add(500);
		System.out.println(h);
		
		h.remove(3);
		System.out.println(h);
		
		System.out.println("-----hashset----");
		
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----for each loop-----");
		for(Object s1:h)
		{
			System.out.println(h);
		}
		
		
	}
}
