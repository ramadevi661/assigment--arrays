//this method used to invoke current class constructor

package assesment;

public class This_Constructor {
	
	   This_Constructor()
	{
		System.out.println("no arg constructor");
	}
	   This_Constructor(int a)
      {
		   this();
    	  System.out.println("parameterised cons "+a);
      }

	public static void main(String[]args)
	{
		This_Constructor t = new This_Constructor(12);
	
	/*	This_Constructor t1             //advantage of this  : instead of  creating object we can use this() to call the above method
		= new This_Constructor();*/
	}
	
}
