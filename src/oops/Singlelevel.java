package oops;
class parent
{
public void parentdetails()
{
	System.out.println("M.N.Mohanan");
}
}
class child extends parent
{
	public void childdetails()
	{
		System.out.println("Arun");

	}}
public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		obj.childdetails();
		obj.parentdetails();
	}

}
