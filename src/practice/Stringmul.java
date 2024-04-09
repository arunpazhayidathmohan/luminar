package practice;

import java.util.Scanner;

public class Stringmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter raw");
		int raw=sc.nextInt();
		System.out.println("Enter raw");
		int column=sc.nextInt();
		System.out.println("Enter values");
		String[][] name= new String[raw][column];
		for(int i=0;i<raw;i++)
		{
			for(int j=0;j<column;j++)
			{
				name[i][j]=sc.next();
				
			}
		}
		System.out.println("Entered String");

		for(String[] s:name)
		{
			for(String s1:s)
			{
				System.out.print(s1+" ");

			}System.out.println();

		}
	}

}
