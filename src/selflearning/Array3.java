package selflearning;

import java.util.Iterator;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Limit");
		int limit=sc.nextInt();
		System.out.println("Enter the number");
		int arr[]=new int[limit];
		int even=0;
		int odd=0;
		for(int i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				even++;
			}else
			{
				odd++;
			}
			
		}
		for(int i=0;i<limit;i++)
		{
			if(arr[i]%2==0)
			{
			System.out.println("Even numbers are"+arr[i]);}
			else
			{
				System.out.println("odd numbers are"+arr[i]);

			}
		}

		System.out.println("Even number count="+even);
		System.out.println("Odd number count="+odd);


	}

}
