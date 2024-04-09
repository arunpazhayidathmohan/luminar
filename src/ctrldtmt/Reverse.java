package ctrldtmt;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123,rev=0;
		
		for(;number!=0;number=number/10)
		{
		int rem=number%10;
		rev=rev*10+rem;
		}
		System.out.println(rev);

	}

}
