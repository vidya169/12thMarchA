package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist3 {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
				al.add("Infosys");
				al.add('A');
				al.add(100);
				al.add(null);
				
				System.out.println(al.size());
				System.out.println(al.contains(100));
				System.out.println(al.isEmpty());
				
				al.add("vidya");
				System.out.println(al);
				
				al.remove(2);
				System.out.println(al);
				
				al.set(4, "bakwass");
				System.out.println(al);
				
				System.out.println("-----Iterator--------");
				
				Iterator itr= al.iterator(); 
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				System.out.println("----List Iterator-----------------");
				
				ListIterator litr= al.listIterator();
				while(litr.hasNext())
				{
					System.out.println(litr.next());
				}
				
				System.out.println("---------for loop----------");
				
				for(int i=0;i<=al.size()-1;i++)
				{
					System.out.println(al.get(i));
				}
				
				System.out.println("------for each loop");
				{
					for(Object s1:al)
					{
						System.out.println(s1);
					}
						
				}
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
