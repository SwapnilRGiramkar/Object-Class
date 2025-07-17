//toString(),hashCode() and equals(Object obj) methods in one class
//class Camera
package objectclass;

public class Camera extends Object
{
	String series;
	String brand;
	double price;
	int px;
	String type;
	
	public Camera() 
	{
		super();
	}
	
	Camera(String cseries,String cbrand,double cprice,int cpx,String ctype)
	{
		series=cseries;
		brand=cbrand;
		price=cprice;
		px=cpx;
		type=ctype;
	}
	
	public String toString()
	{
		return "[Series: "+series+" Brand"+brand+" Price : "+price+" Pixels : "+px+" Type : "+type+"]";
	}
	
	public boolean equals(Object obj)
	{
		Camera c1=(Camera)obj;
		if(this.series==c1.series && this.brand==c1.brand && this.price==c1.price && this.px==c1.px && 
				this.type==c1.type)
		{
			return true;
		}
		return false;
	}
	
	public int hashcode()
	{
		return px+series.hashCode()+brand.hashCode()+type.hashCode();
	}
	
	public void displayCamera()
	{
		System.out.println("Series : "+series);
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Pixels : "+px);
		System.out.println("Type : "+type);
		System.out.println("------------------------------------------------------------------------");
	}
}
//------------------------------------------------------------------------------------------------------------------------
//Driver class
package objectclass;

public class CameraDriver 
{
	public static void main(String[] args) 
	{
		Camera c1=new Camera("108pr", "SONY", 20000.0, 5, "HandHeld");
		System.out.println("HashCose : "+c1.hashcode());
		System.out.println("reference : "+c1);
		
		Camera c2=new Camera("108pr", "SONY", 20000.0, 5, "HandHeld");
		System.out.println("HashCose : "+c2.hashcode());
		System.out.println("reference : "+c2);
		
		System.out.println("Compares Original reference : "+(c1==c2));
		System.out.println("Compare the Attributes : "+c1.equals(c2));
	}
}

