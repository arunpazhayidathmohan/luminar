package practice;

import java.util.Scanner;


public class Stringoddevencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		int arr[]=new int[limit];
		System.out.println("Enter the numbers");
		for(int i=0;i<limit;i++)
		{arr[i]=sc.nextInt();
			
		}int even=0;
		int odd=0;
		for(int i=0;i<limit;i++)
		{
			if (arr[i]%2==0)
			{
			even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("number of odd numbers="+odd);
		System.out.println("number of Even numbers="+even);


		
	}

}
