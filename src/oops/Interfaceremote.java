package oops;

interface Tvremote
{
	public void channels();
}
interface Smarttvremote extends Tvremote
{
	public void Smarttv();
	
}
class Tv implements Smarttvremote
{

	@Override
	public void channels() {
		// TODO Auto-generated method stub
		System.out.println("New Channel");

	}

	@Override
	public void Smarttv() {
		// TODO Auto-generated method stub
		System.out.println("Smart Channel");

	}
	
}
public class Interfaceremote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t=new Tv();
		t.channels();
		t.Smarttv();
		
	}

}
