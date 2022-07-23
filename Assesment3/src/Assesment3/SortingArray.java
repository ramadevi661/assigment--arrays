package Assesment3;
import java.util.*;
import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of the array:");
			int size = sc.nextInt();
			int []Num=new int[size];
			System.out.print("Array Elements:");
			for(int  i=0; i<Num.length; i++)
			{
				Num[i]=sc.nextInt();
			}
			System.out.print("Sorting of Array Elements:");
			for(int i=0; i<Num.length; i++)
			{
				Arrays.sort(Num);
				System.out.print(Num[i]+" ");
			}
	      }
	}