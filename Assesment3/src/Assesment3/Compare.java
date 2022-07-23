package Assesment3;
import java.util.*;
public class Compare
{
 public static void main (String args[])
	  {
	    ArrayList < Student > al = new ArrayList < Student > ();
	    al.add (new Student (102, "rama", 26));
	    al.add (new Student (116, "raju", 30));
	    al.add (new Student (115, "nani", 21));
	    Collections.sort (al);
	    for (Student st:al)
	      {
	   System.out.println (st.rollno + " " + st.name + " " + st.age);
	      }
	  }
	}
	class Student implements Comparable < Student >
	{
	  int rollno;
	  String name;
	  int age;
	  Student (int rollno, String name, int age)
	  {
	    this.rollno = rollno;
	    this.name = name;
	    this.age = age;
	  }
	  public int compareTo (Student st)
	  {
	    if (age == st.age)
	      return 0;
	    else if (age < st.age)
	      return 1;
	    else
	      return -1;
	  }
	}


