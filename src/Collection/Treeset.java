package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
		t.add(200);
		t.add(100);
		t.add(500);
		t.add(300);
		
		System.out.println(t.size());
		
		System.out.println(t.remove(3));
		
		System.out.println("----Iterator-----");
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---for each loop----");
		for(Object s1:t)
		{
			System.out.println(t);
		}
		
		
	}

}
