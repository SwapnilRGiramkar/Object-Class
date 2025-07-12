//This is the example of hashCode() method
//Class Emp
package objectclass;

public class Emp extends Object
{
	String name;
	int empid;
	double sal;
	String dept;
	int exp;
	String compony;
	char grade;
	
	public Emp() 
	{
		super();
	}
	
	Emp(String name,int empid,double sal,String dept,int exp,String compony,char grade)
	{
		this.name=name;
		this.empid=empid;
		this.sal=sal;
		this.dept=dept;
		this.exp=exp;
		this.compony=compony;
		this.grade=grade;
	}
	
	public String toString()
	{
		return "[Name : "+name+ ",Emp Id : "+empid+",Salary : "+sal+",Department : "+dept+",Expirience : "+exp+",Compony : "+compony+",Grade : "+grade+"]";
	}
	
	public boolean equals(Object obj)
	{
		Emp e=(Emp) obj;
		if(name==e.name && empid==e.empid && sal==e.sal && dept==e.dept && exp==e.exp 
				&& compony==e.compony && grade==e.grade)
		{
			return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		return empid+exp+grade+name.hashCode()+dept.hashCode()+compony.hashCode();
	}

}
//---------------------------------------------------------------------------------------------
//class EmpDriver
package objectclass;

public class EmpDriver 
{
	public static void main(String[] args) 
	{
		Emp e1=new Emp("Swapnil",12345,50000.0,"Dev",5,"Amazon",'A');
		Emp e=new Emp("Swapnil",12345,50000.0,"Dev",5,"Amazon",'A');
		
		System.out.println(e1);
		System.out.println(e);
		
		System.out.println(e1==e);
		System.out.println(e1.equals(e));
		
		System.out.println(e1.hashCode());
		System.out.println(e.hashCode());
		
		
	}
}
//-----------------------------------------------------------------------------------------
//Output
//[Name : Swapnil,Emp Id : 12345,Salary : 50000.0,Department : Dev,Expirience : 5,Compony : Amazon,Grade : A]
//[Name : Swapnil,Emp Id : 12345,Salary : 50000.0,Department : Dev,Expirience : 5,Compony : Amazon,Grade : A]
//false
//true
//1817940502
//1817940502

