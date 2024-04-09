package pkg;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--Arithmetic Operators--");
		int a=20,b=6;
		
		System.out.println("Result of a+b="+(a+b));
		System.out.println("Result of a-b="+(a-b));
		System.out.println("Result of a*b="+(a*b));
		System.out.println("Result of a/b="+(a/b));
		System.out.println("Result of a%b="+(a%b));
		
		System.out.println("--Assignment Operators--");
		int c=a;
		System.out.println("Result="+(a+=b));
		System.out.println("Result="+(a-=b));
		System.out.println("Result="+(a*=b));
		System.out.println("Result="+(a/=b));
		System.out.println("Result="+(a%=b));
		
		System.out.println("--Relational Operators--");
		int v1=5,v2=6;
		System.out.println("Result of v1>v2 "+(v1>v2));
		System.out.println("Result of v1<v2 "+(v1<v2));
		System.out.println("Result of v1>=v2 "+(v1>=v2));
		System.out.println("Result of v1<=v2 "+(v1<=v2));
		System.out.println("Result of v1==v2 "+(v1==v2));
		System.out.println("Result of v1!=v2 "+(v1!=v2));
		
		System.out.println("--Logical Operators--");
		String Name="Arun";
		String Pass="1234";
		System.out.println(Name=="Arun"&&Pass=="1234");
		System.out.println(Name=="Arun"||Pass=="1234");
		System.out.println(Name=="Arun"&&Pass=="123");		
		System.out.println(!(Name=="Arun"));

		System.out.println("--Unary Operators--");
		int v3=5;
		System.out.println(v3++);
		System.out.println(++v3);
		System.out.println(v3--);
		System.out.println(--v3);

		System.out.println("--Ternary Operators--");
		String s=v1>v2?"v1 is grater":"v2 is greater";
		System.out.println(s);
		
		
	}

}
