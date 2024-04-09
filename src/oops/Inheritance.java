package oops;

class member{
	String name,address;
	int age,salary;
	long number;
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(number);
		System.out.println(address);
		System.out.println(salary);
	}
}
class employee extends member{	
		String specialization;
}
class manager extends member{
	String department;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member ob=new member();
		ob.name="Arun";
		ob.age=28;
		ob.number=7907963117l;
		ob.address="Pazhayidath";
		ob.salary=75000;
		ob.printdetails();
		
	}

}
