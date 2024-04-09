package oops;

class job
{
	public void job1()
	{
		System.out.println("Engineer");

	}
}
class div extends job
{
	@Override
	public void job1()
	{
		System.out.println("Mechanical");
		super.job1();

	}
}

public class Runtimepoli {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div obj=new div();
		obj.job1();
		
	}

	
}
