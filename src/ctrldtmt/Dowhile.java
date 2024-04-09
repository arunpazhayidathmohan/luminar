package ctrldtmt;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char d;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Result="+c);
		
		System.out.println("Do you Wish to Continue(y/n)?");
		d=sc.next().charAt(0);
		}
		while(d=='y');
		
		}
}
	