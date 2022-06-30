package assesment;

public class This_constructorcall1 {

			void m2()
			{
				  This_constructorcall c = new This_constructorcall(this);
				
				
			}
			public static void main (String[] args)
			{
				
				This_constructorcall1 tc = new This_constructorcall1();
				tc.m2();
			}
		}
