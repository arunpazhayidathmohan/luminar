package practice;

import java.util.Scanner;

public class Arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= new String[4];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		
		for(int i=0;i<4;i++)
		{
			name[i]=sc.next();
				
		}System.out.println("Entered Array");
		for(String s:name)
		{
			
			System.out.println(s);

		}

		

	}
	

}
