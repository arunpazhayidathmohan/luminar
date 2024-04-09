package ctrldtmt;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int a=n;
		int rem=0;
		int arm=0;
		while(n>0)
		{
		rem=n%10;//1 
		arm=arm+rem*rem*rem;//1
		n=n/10;//15
		}
		System.out.println(arm);
		if(a==arm)
		{	System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}


	}

}
