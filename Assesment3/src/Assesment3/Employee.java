package Assesment3;
import java.util.*;
import java.util.stream.Collectors;
public class Employee 
{
String name;
		int age;
		Employee(String name, int age)
		{
			this.name=name;
			this.age=age;
		}
		public static void main(String[] args)
		{
			List <Employee>person = new ArrayList<Employee>();
			person.add(new Employee("rama",16));
			person.add(new Employee("uma", 15));
			person.add(new Employee("devi",24));
			person.add(new Employee("pruthvi", 19));
			person.add(new Employee("raju",22));
			person.add(new Employee("ramesh", 17));
	person.stream().filter(P -> P.age >18).collect(Collectors.toList()).forEach(Person ->System.out.print(Person.name+" "));
		}
	}