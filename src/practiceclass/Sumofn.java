package practiceclass;

import java.util.Scanner;

public class Sumofn {

	public void add()
	{	int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		System.out.println("Enter the number");
		for(int i=1;i<=limit;i++)
		{
			System.out.println(i);

		}
		System.out.println("Sum of limit=");
		for(int i=1;i<=limit;i++)
		{
			temp=temp+i;
		}System.out.println(temp);


		sc.close();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumofn obj=new Sumofn();
		obj.add();
	}

}
