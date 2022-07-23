package Assesment3;
import java.util.*;

public class LargestAndSmallestArray {

	public static void main(String[] args) 
	{
		int l,s;
		int a[] = new int[]{1, 2, 3, 4, 5};
		int n = a.length;
		l=s=a[0];
		for(int i=1;i<n;++i)
		{
		if(a[i]>l)
		l=a[i];

		if(a[i]<s)
		s=a[i];
		}

		System.out.println("smallest no:"+s);
		System.out.print("largest no:"+l);
	
	}

}
