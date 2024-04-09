package practice;

import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String s=sc.nextLine();
		char[] st=s.toCharArray();//string to character array
		sc.close();
		int count;
		int a = 0;
		for(int i=0;i<st.length;i++)
		{
			count =1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j])
				{
					count++;
					st[j]='0';
				}
			}count=a;
			if(count>1&&st[i]!='0')
			{
				System.out.println("Repeated characters "+st[i]);
				System.out.println("Count="+count);


			}
		}if(a<1)
		{
			System.out.println("No Repetition");

		}
	}

}
