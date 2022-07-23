package Assesment3;
import java.io.FileWriter;
import java.io.IOException;
public class Finally {
		public static void main(String[] args)
		{
		try {
			FileWriter fw = new FileWriter("rama.txt");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		finally
		{
			System.out.print("hello rama");
		}
		}
	}

