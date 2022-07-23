package Assesment3;

public class ArraysContainSameElemet 
{	
	public static void main(String[] args)
		{
			int[] a = {1,3,4,5};
			int[] a1 = {1,3,4};
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a1.length; j++)
				{
					if(a[i]==a1[j])
					{
						count++;
					}
				}
			}
			if(count==a1.length)
			{
				System.out.print("The arrays contains common numbers");
			}
			else
			{
				System.out.print("The arrays contains different numbers");
			}
		}
	}

