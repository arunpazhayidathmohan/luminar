package selflearning;

import java.util.Scanner;

public class Arraypallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character to be reversed");
		char arr[]= new char[5];
		int a=arr.length;	
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.next().charAt(0);
			
		}
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]);
			
		}
		


	}

}
