package practiceclass;

import java.util.Scanner;

public class Arraylarge {
	public void array()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in an array");
		int arr[]=new int[5];
		int max=0;
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			if(max<arr[i])
			{
				max=arr[i];

			}

		}System.out.println("max is="+max);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylarge obj=new Arraylarge();
		obj.array();
	}

}
