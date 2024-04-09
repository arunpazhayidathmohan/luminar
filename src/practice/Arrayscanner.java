package practice;

import java.util.Scanner;

public class Arrayscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[3];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered Numbers");
		for (int i=0;i<3;i++)
		{
			System.out.println(ar[i]);

		}

	}

}
