package practice;

import java.util.Scanner;

public class Stringpali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String word=sc.nextLine();
		
		int i=0;
		int j=word.length()-1;
		while(i<j&&word.charAt(i)==word.charAt(j))
		{
			i++;
			j--;
		}
		if(i>=j)
		{
			System.out.println("Pallindrome");

		}else {
			System.out.println("Not Pallindrome");

		}
	}

}
