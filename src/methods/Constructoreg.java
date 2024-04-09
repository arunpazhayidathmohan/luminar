package methods;

public class Constructoreg {
	String name;
	int Age;
	public Constructoreg(String name,int Age)
	{
		this.name=name;
		this.Age=Age;
	}
	public void display()
	{
		System.out.println(name+" "+Age);

	}
	
	public static void main(String[] args) {
		
		Constructoreg obj=new Constructoreg("Arun",100);
		obj.display();
	}

}
