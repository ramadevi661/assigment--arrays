package Assesment3;

public class UncheckedException
{
	public static void main(String[] args) {
	
		int a=25,b=0;
		try {
			;
			System.out.println("exception creation"+a/b);

		}
		catch( ArithmeticException  e){
			
			System.out.print(e);

		}
	}

}
