package ctrldtmt;

public class Whilerev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int a=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of the number ="+rev);
		
		if(a==rev)
		{
			System.out.println("Number is Pallindrome");

		}
		else
		{
			System.out.println("Number is not Pallindrome");			
		}
	}

}
