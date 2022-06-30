//pass an argument in method


package assesment;

public class This_Argument 
{

void rama(This_Argument a)
{
	System.out.println("this is my first trial");
	
}
void uma()
{
	rama(this);
}
public static void main(String[]args)
{
	This_Argument t = new This_Argument();
	t.uma();
}
}