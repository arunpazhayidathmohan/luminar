package methods;

public class ReturnPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnPar obj=new ReturnPar();
		obj.add();
		System.out.println(obj.sub(2, 1));
		System.out.println(obj.mul());
		obj.div(5, 2);


	}
	public void add()
	{
		int a=1;
		int b=2;
		int c=a+b;
		System.out.println(c);

				
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	}
	public int mul()
	{
		int a=2,b=2,c;
		c=a*b;
		return c;
	}
	public void div(double a, double b)
	{
		double c=a/b;
		System.out.println(c);
		

	}
	
}
