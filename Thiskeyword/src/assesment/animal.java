package assesment;

public class animal {

	void show()
	{
		System.out.println("Parent's show()");
	}
}


class Child extends animal 
{
	void show()
	{
		System.out.println("Child's show()");
	}


	public static void main(String[] args)
	{

		animal obj1 = new animal ();
		obj1.show();

		
		animal  obj2 = new Child();
		obj2.show();
	}
}
