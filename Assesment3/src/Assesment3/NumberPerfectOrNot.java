package Assesment3;
import java.util.Scanner;


public class NumberPerfectOrNot 
{
	
public static void main(String[]args) {
int n, sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number  to check weather it is a perfect number or not:");
    n = s.nextInt();
    for(int i = 1; i < n; i++)
    {
        if(n % i == 0)
        {
            sum = sum + i;
        }
    }
    if(sum == n)
    {
        System.out.println("Given number is Perfect");
    }
    else
    {
        System.out.println("Given number is not Perfect");
    }    

}
}