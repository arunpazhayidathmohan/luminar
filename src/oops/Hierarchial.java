package oops;
class father1
{
	public void dad()
	{
		System.out.println("M N Mohanan");

	}
}
class daughter extends father1
{
	public void kid1()
	{
		System.out.println("Anjali P.M");
	}
}
class son2 extends father1
{
	public void kid2()
	{
		System.out.println("Arun");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daughter obj=new daughter();
		son2 obj1=new son2();
		obj1.dad();
		obj1.kid2();
		obj.dad();
		obj.kid1();
		Accessmodier obj2=new Accessmodier();
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		System.out.println(obj2.d);
		
	}

}
