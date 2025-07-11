//This Program gives understanding of equals method
package objectclass;

public class Employee extends Object
{
	String name;
	int empid;
	double salary;
	String dept;
	String compony;
	double exp;
	char grade;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, int empid, double salary, String dept, String compony, double exp, char grade) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
		this.compony = compony;
		this.exp = exp;
		this.grade = grade;
	}
	
	public String toString()
	{
		return "[Name :" +name+",Emp id : "+empid+",Salary : "+salary+",Department"+dept+
			",Compony : "+compony+",Grade : "+grade+"]";
	}
	
	public boolean equals(Object obj)
	{
		Employee e2=(Employee) obj;
		if(this.name==e2.name && this.empid==e2.empid && this.salary==e2.salary && this.dept==e2.dept && this.compony==e2.compony && this.grade==e2.grade)
		{
			return true;
		}
		return false;
	}
}
//-------------------------------------------------------------------------------------------------------
package objectclass;

public class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee e1 =new Employee("Swapnil",1546,4500.0,"Dev","StarFish",3,'A');
		System.out.println(e1);
		
		Employee e2= new Employee("Swapnil",1546,4500.0,"Dev","StarFish",3,'A');
		System.out.println(e2);
		
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}

