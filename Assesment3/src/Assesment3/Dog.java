package Assesment3;

public class Dog  extends Animal{
	void run()
	{
		System.out.println("dog can run");
	}

	public static void main(String[] args)
	{
		Animal d = new Dog();
		d.run();
		

	}

}
