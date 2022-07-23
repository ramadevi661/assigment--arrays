package Assesment3;
import java.util.ArrayList;
public class EvenNoFromList 
{ 
  public static void main(String[] args) 
  {
int[] myArray={1,2,5,6,7,10} ;
  ArrayList<Integer>evenList = new ArrayList<Integer>();
  for(int i=0;i<myArray.length;i++)
		       {
		         if(myArray[i]%2==0)
		          {
		            evenList.add(myArray[i]);
		          }
		       }
		    for(int even : evenList)
		    System.out.print(even+",");
		    }
 }

