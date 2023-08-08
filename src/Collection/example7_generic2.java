package Collection;
import java.util.ArrayList;
import java.util.TreeSet;

public class example7_generic2
{
	public static void main(String[] args)
	{		
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc");
		al.add("xyz");
		al.add("100");
		al.add("65.5f");	
		
		for(String s1:al)
		{
			System.out.println(s1);
		}
	}

	}

