package Assesment3;



public class Student1 {
	
	
		String name;
		int age;
		long mbno;
		
		 Student1(String name,int age)
		{
			 this.name=name;
			 this.age=age;
			 
		}
		Student1(String name,int age,long mbno)
		{
			 this(name,age);
			this.mbno=mbno;
		}
		   void show( String r)
		
		{
			System.out.println("student name is:"+name+"\n "+"age is:"+age+" \n"+"mobile nor is:"+mbno);
		}
		
		public static void main(String[] args) 
		{
			Student1 s = new Student1("rama",25,9347685150l);
			
			s.show(s.name);
			
		}

	}
