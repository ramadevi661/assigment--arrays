package Assesment3;

public class NullpointerException
{
			String name=null;
			public static void main(String[] args)
			{
				try {
					System.out.print(name);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		}

