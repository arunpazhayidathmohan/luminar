package oops;

interface Basicanimal{
	public void eat();
	public void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("Monkey Jump");

	}
	public void bite()
	{
		System.out.println("Monkey Bite");

	}
}
class human extends Monkey implements Basicanimal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Monkey and Human Eats");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Monkey and Human  Sleeps");

		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h=new human();
		h.bite();
		h.jump();
		h.eat();
		h.sleep();
	}

}
