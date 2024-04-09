package practice;

import java.util.Scanner;

public class Stringlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of String");
		int limit=sc.nextInt();
		int arr[]=new int[limit];
		
		System.out.println("Enter Elements of array");
		for(int i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
		}System.out.println("Largest Num is "+max);


	}

}
