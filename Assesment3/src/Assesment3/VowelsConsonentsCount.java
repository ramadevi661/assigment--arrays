package Assesment3;
import java.util.*;
public class VowelsConsonentsCount {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Input string : ");
	

 int vCount = 0; 
 int cCount = 0;
	    String str1 =  sc.nextLine();
	  
	    for (int i = 0; i < str1.length (); i++)
	      {
		if (str1.charAt (i) == 'a' || str1.charAt (i) == 'e'
		    || str1.charAt (i) == 'i' || str1.charAt (i) == 'o'
		    || str1.charAt (i) == 'u')
		  {
		     
		    vCount++;
		  }
		else if (str1.charAt (i) >= 'a' && str1.charAt (i) <= 'z')
		  {
		    cCount++;
		  }
	      }
	    System.out.println ("Number of vowels: " + vCount);
	    System.out.println ("Number of consonants: " + cCount);
	  }
	}

