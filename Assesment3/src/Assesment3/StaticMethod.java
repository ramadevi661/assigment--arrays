package Assesment3;
import java.util.Scanner;

public class StaticMethod {
	
		static void Animal(String name)
		{
			System.out.print("Name:"+name);
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter input:");
			Animal(sc.next());
		}
	}