//current class instance variable

package assesment;

public class Task {
	
	int a =10;//instance variable
	int b=30;
	
	void setvalue(int a)
	{
		                            //first preference local variable
		this.a=a;                     // then global
	}
	void m2()
	{
		
		System.out.println(a);
	}
	
public static void main (String[] args)
{
	
Task t =new Task();
t.setvalue(100);
t.m2();
	
}
}







