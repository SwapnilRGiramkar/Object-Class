//equals method of object class Example
package objectclass;

public class Student
{
	String name;
	int id;
	String college;
	String princi;
	String hod;
	
	public Student() 
	{
		super();
	}

	public Student(String name, int id, String college, String princi, String hod) {
		super();
		this.name = name;
		this.id = id;
		this.college = college;
		this.princi = princi;
		this.hod = hod;
	}
	public boolean equals(Object obj)
	{
		Student s2=(Student) obj;
		if (this.name==s2.name&&this.id==s2.id&&this.college==s2.college&&this.princi==s2.princi&&this.hod==s2.hod); 
		{
			return true;
		}
	}
}
//-----------------------------------------------------------------------------
package objectclass;

public class StudentDriver {

	public static void main(String[] args) 
	{
		Student s1=new Student("Swapnil", 47, "APCOER", "Thakare", "Kadam");
		System.out.println(s1);

		Student s2=new Student("Swapnil", 47, "APCOER", "Thakare", "Kadam");
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}

