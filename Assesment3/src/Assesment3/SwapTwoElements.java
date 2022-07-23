package Assesment3;
import java.util.*;
public class SwapTwoElements 
{

	public static void main(String[] args)
	{
	   
	   Scanner sc = new Scanner(System.in);
	  
	    int s =sc.nextInt();
	    int r = sc.nextInt();
	    System.out.println("before swapping:"+s+" "+r);
	    s= s+r;//5
	    r = s-r;//5-2//3
	    r = s-r;//5-3//2
	   
		System.out.println("after swapping:"+s+" "+r);
	}



}
