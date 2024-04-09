package ctrldtmt;

import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int a=sc.nextInt();
		if (a<18)
		{
			System.out.println("Not Eligible");

		}else {
			System.out.println("Eligible");

		}
		


	}

}
