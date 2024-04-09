package selflearning;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String temp=str;
		String rev="";
		for( int i=str.length()-1;i>=0;i--)
		{
		
		rev=rev+str.charAt(i);
		}System.out.print("reversed String="+rev);
		System.out.println();


		if(temp.equals(rev))
		{
			System.out.println("Pallindrome");

		}
		else
		{
			System.out.println("Not Pallindrome");

		}
	}

}
