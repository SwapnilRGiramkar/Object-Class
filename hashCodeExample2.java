//This is example of hashCode() method
//Class Mobile
package objectclass;

public class Mobile extends Object
{
	String name;
	String brand; 
	double price;
	String color;
	int ram;
	int rom;
	
	public Mobile() 
	{
		super();
	}
	Mobile(String name,String brand,double price,String color,int ram,int rom)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.ram=ram;
		this.rom=rom;
	}
	
	public boolean equals(Object obj)
	{
		Mobile m=(Mobile) obj;
		if(name==m.name && brand ==m.brand && price==m.price && color==m.color &&ram==m.ram && rom==m.rom)
		{
			return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		int op=0;
		op=ram+rom+name.hashCode()+brand.hashCode()+color.hashCode();
		return op;
	}

}
//------------------------------------------------------------------------------------
//Class MobileDriver
package objectclass;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile m=new Mobile("Redmi note 10 pro", "MI", 15000.0, "Blue", 16, 128);
		Mobile m1=new Mobile("Redmi note 10 pro", "MI", 15000.0, "Blue", 16, 128);
		
		System.out.println(m);
		System.out.println(m1);
		
		System.out.println(m==m1);
		System.out.println(m.equals(m1));
		
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
	}

}
//---------------------------------------------------------------------------------------
//OutPut
//objectclass.Mobile@e83b65ed
//objectclass.Mobile@e83b65ed
//false
//true
//-398760467
//-398760467

