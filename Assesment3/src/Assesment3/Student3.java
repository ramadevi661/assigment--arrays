package Assesment3;

public class Student3 
{
 int rollno;  
 String name;  
 static String college = "ITS";  
	     //static method to change the value of static variable  
static void change()
{  
college = "CMRCET"; 
System.out.print("Rama");

}  
void display()
{
System.out.println(rollno+" "+name+" "+college);
}  
public static void main(String[] args)
{
	change();
	Student3 s = new Student3();
	s.display();
}
}  
