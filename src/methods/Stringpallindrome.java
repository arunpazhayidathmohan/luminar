package methods;

import java.util.Scanner;

public class Stringpallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Stringpallindrome obj=new Stringpallindrome();
	obj.checkPalindrome();
		
	}
	public void checkPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.next();
		String rev="";
		for( int i=str.length()-1;i>=0;i--)
			{
			rev=rev+str.charAt(i);
			}
			if(str.equals(rev))
			{
				System.out.println("Pallindrome");
			}else
			{
			System.out.println("Not Pallindrome");

			}
		
	}
	
		
}	