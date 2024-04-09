package practice;

import java.util.Scanner;

public class Stringpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{String line="";
			for(int j=0;j<i;j++)
			{
				line=line+i;
			}System.out.println(line);

		}

	}

}
