package Collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class ex7_generic2 {
	
	public static void main(String[] args)
		{		
			ArrayList<Object> al=new ArrayList<Object>();	
			al.add("abc");
			al.add("xyz");
			al.add(100);
			al.add(12.5f);
			
			for(Object s1:al)
			{
				System.out.println(s1);
			}
		}
}
