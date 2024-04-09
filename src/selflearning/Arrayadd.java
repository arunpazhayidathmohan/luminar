package selflearning;

import java.util.Scanner;

public class Arrayadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First and Second Array");
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
			c[i]=a[i]+b[i];
		}
		for(int i=0;i<5;i++) {
			
			System.out.print(c[i]+" ");


		}
	sc.close();
	}

}
