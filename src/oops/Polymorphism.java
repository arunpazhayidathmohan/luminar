package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism obj= new Polymorphism();
		obj.add();
		obj.add(2, 2.4);
		obj.add(4, 5);
		
		
	}
	public void add()
	{
		int a=4,b=5,c;
		c=a+b;
		System.out.println(c);

	}
	public void add(int a,int b)
	{
		int c =a+b;
		System.out.println(c);

	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);

	}
}
