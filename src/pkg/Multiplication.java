package pkg;
import oops.Accessmodier;

public class Multiplication extends Accessmodier {

	public static void main(String[] args) {
   int a=5;
   int b=10;
   int c;
   int d=20,e=30,f;
   c=a*b;
   f=d*e;
   System.out.println("Result="+c);
   System.out.println("Result="+f);
   Accessmodier obj= new Accessmodier();
   System.out.println(obj.d);
   Multiplication obj1 = new Multiplication();
   System.out.println(obj1.c);

	
	}

}
