package Assesment3;
import java.util.*;
public class NearestPrimeNumber {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count=0;
	for(int i=1;i<count;i++)
	{
		if(n%i==0)
		{
			count++;
			System.out.println();
	
		}
		if(count==2)
		{
			System.out.println("false");
		}
	}
	
	}}
