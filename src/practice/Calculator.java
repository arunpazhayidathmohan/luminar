package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char option;
		do
		{
			System.out.println("Enter first number");
			int first=sc.nextInt();
			System.out.println("Enter second number");
			int second=sc.nextInt();
			System.out.println("Enter Your Choice");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			int choice=sc.nextInt();
			int result = 0;
			switch(choice)
			{
			case 1:result=first+second;
			break;
			case 2:result=first-second;
			break;
			case 3:result=first*second;
			break;
			case 4:result=first/second;
			break;
			default:System.out.println("Invalid");
			}
			System.out.println("Result="+result);
			option=sc.next().charAt(0);		
		}
	
		
		while(option=='y');
		{
		sc.close();
		}
		
		
	}

}
