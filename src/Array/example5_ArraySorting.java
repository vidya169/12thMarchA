package Array;

import java.util.Arrays;

public class example5_ArraySorting {
/*	public static void main(String[] args) {
		 
		
		int [] ar=new int[5];
		
		ar[0]=40;
		ar[1]=50;
		ar[2]=10;
		ar[3]=30;
		ar[4]=20;
		
		System.out.println("print original data");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("--print array in asending order--");
		
		Arrays.sort(ar);
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
        System.out.println("--print array in disending order--");
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	} */
	
	public static void main(String[] args)
	{
		int[] ar=new int[4];
		ar[0]=10;
		ar[1]=30;
		ar[2]=20;
		ar[3]=40;
		
		System.out.println(ar.length);
		System.out.println("print original data");
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("print assending order");
	
			Arrays.sort(ar);
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.println(ar[i]);
		}
			System.out.println("print desending order");
			for(int i=ar.length-1;i>=0;i--)
			{
				System.out.println(ar[i]);
			}
	}

}
