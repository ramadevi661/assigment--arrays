package Assesment3;
import java.util.*;
public class InstanceMethod {
	void Animal(String name)
	{
		System.out.print("Animal name:"+name);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		InstanceMethod i = new InstanceMethod();
        i.Animal(sc.next());
	}
}