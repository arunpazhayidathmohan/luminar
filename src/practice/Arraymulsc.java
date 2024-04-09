package practice;

import java.util.Scanner;

public class Arraymulsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}System.out.println("the entered array is");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");

			}System.out.println();

		}
	}

}
