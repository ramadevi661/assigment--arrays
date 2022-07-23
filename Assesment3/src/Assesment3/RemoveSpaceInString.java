package Assesment3;
import java.util.*;
public class RemoveSpaceInString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input:");
		String s = sc.nextLine();
		s =s.replaceAll("\\s", "");
System.out.println(" after removing spaces:"+s);
	}

}
