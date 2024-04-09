package practice;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean prime=true;
		
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if (num%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime && num>0) {
			System.out.println("Prime Number");

		}
		else
		{
			System.out.println("Not Prime Number");

		}
	}

}
