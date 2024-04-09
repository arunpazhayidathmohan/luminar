package pkg;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c;
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		
		
		int d=10,e=20;
		System.out.println("value of d="+d);
		System.out.println("value of e="+e);
		d=d+e;
		e=d-e;
		d=d-e;
		System.out.println("After Swapping");
		System.out.println("value of a="+d);
		System.out.println("value of b="+e);
		
	}

}
