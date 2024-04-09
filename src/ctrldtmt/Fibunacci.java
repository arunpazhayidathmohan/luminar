package ctrldtmt;

import java.util.Scanner;

public class Fibunacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit =sc.nextInt();
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=2;i<limit;i++)
		{
		int result=first+second;	
		System.out.println(result);
		first=second;
		second=result;
		}
	}

}
