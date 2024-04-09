package ctrldtmt;

public class Switchcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10;
		char c='-';
		
		switch(c)
		{
		case '+':System.out.println("Result of a+b="+(a+b));
		break;
		case '-':System.out.println("Result of a-b="+(a-b));
		break;
		case '/':System.out.println("Result of a/b="+(a/b));
		break;
		case '*':System.out.println("Result of a*b="+(a*b));
		break;
		default:System.out.println("Invalid");

		}
	}

}
