package practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		System.out.println("Reverse ="+rev);

	}

}
