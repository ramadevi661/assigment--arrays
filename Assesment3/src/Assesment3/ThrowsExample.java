package Assesment3;
import java.io.*; 
public class ThrowsExample { 
public static void main(String args[])throws ArithmeticException 
{ 
 try{
	int a=25/0;
  }
  catch(ArithmeticException e)
 {
	  System.out.println(e);
	  System.out.println("divison con't ne done using zero");
		  }
		   } 

		}