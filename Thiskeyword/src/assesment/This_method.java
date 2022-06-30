
//this key word used to invoke current class method

package assesment;

public class This_method {
	
	void rama()
	{
		System.out.println("hello rama");
	}
	
	void raju()
	{
	
		this.rama();// or rama() raju method calls rama method
	}
	public static void main(String[] args)
	{
		This_method t= new This_method();
		t.raju();
	}
	
}
