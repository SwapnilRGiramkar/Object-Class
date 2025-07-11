//This Program is help to understand toString method
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
}
//--------------------------------------------------------------------------------------------------------
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
//---------------------------------------------------------------------------------------------------
