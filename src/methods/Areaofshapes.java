package methods;

public class Areaofshapes {

	public static void main(String[] args) {
		
	Areaofshapes obj=new Areaofshapes();
	obj.circle();
	System.out.println(obj.rectangle(2, 4));
	System.out.println(obj.square());
	obj.triangle(4, 5);
	}
	public void circle()
	{
		double r=2,a;
		a=3.14*r*r;
		System.out.println(a);

	}
	public int rectangle(int l,int b)
	{
		int c=l*b;
		return c;
	}
	public int square()
	{
		int a=2,c;
		c=a*a;
		return c;
		
	}
	public void triangle(double b,double h)
	{
		double a=0.5*b*h;
		System.out.println(a);

	}

}
