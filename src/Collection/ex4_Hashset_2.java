package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class ex4_Hashset_2 
{

			public static void main(String[] args)
			{
				
					{		
						ArrayList al=new ArrayList(); //by default capacity =10
						al.add("ganesh");
						al.add(100);
						al.add('A');
						al.add(65.5f);
						al.add("ganesh");
						al.add(null);
						al.add(null);		
						System.out.println(al);
						
						
						HashSet hs=new HashSet(al);
						System.out.println(hs);

						
					}
				}
				
				
			}

		

