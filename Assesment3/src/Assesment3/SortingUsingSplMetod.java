package Assesment3;
import java.util.Arrays;
import java.util.Scanner; 

public class SortingUsingSplMetod { 
	public static void main(String[] args)   
	{   
	  Scanner sc = new Scanner(System.in);
	  
	int [] array = new int [] {1, 2, 3, -1, -2, 4};  
	 
	Arrays.sort(array);   
	System.out.println("elements  in assending order:");  
	 
	for (int i = 0; i < array.length; i++)   
	{       
	System.out.println(array[i]);   
	}   
	}  
}


