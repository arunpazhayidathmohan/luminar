package selflearning;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Limit");// 5
		int a=sc.nextInt();
		System.out.println("Enter the number");//1 2 4 5 6
		int arr[]=new int[a];
		//sc.close();
		int max=0;
		for(int i=0;i<a;i++)
		{
		arr[i]=sc.nextInt();
		if(max<arr[i])
		{
			max=arr[i];
		}
		}System.out.println("Max is "+max);
		
		
	}
	

}
