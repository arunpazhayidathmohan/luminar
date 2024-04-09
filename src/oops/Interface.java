package oops;


interface Bike
{	
	public void speedlimit();
}
class Bullet implements Bike{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub

		System.out.println("Bullet");	
	}

}
class Dominar implements Bike{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("Dominar");

	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Dominar();
		b.speedlimit();
		b=new Bullet();
		b.speedlimit();
		
	}

}
