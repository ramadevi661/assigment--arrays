package Assesment3;
import java.util.Scanner;
public class ReverseWordFirstLetterCapital
{
public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name:");
			String name=sc.nextLine();
			String word ;
			String reverseword=" ";
			String rword1=" ";
			String []Name =name.split(" ");
			System.out.print("Reverse of a string:");
			for(int i=0; i<Name.length; i++)
			{
			    word = Name[i];
			    reverseword=" ";
				for(int j=0; j<word.length(); j++)
				{
					char ch=word.charAt(j);
					reverseword = ch+reverseword;
				}
				rword1=rword1+reverseword;
			}
			System.out.println(rword1);
			String cname=" ";
			String []CName =name.split(" ");
			char ch1;
			System.out.print("Reverse of a string and First letter should be capital:");
			for(int i=0; i<CName.length; i++)
			{
			    word = CName[i];
			    reverseword=" ";
				for(int j=0; j<word.length();  j++)
				{
					if(j==word.length()-1)
					{
					ch1 = Character.toUpperCase(word.charAt(j));
					}
					else
					{
						ch1=Character.toLowerCase(word.charAt(j));
					}
					reverseword = ch1+reverseword;
				}
				System.out.print(reverseword);
			}
		}
	}

