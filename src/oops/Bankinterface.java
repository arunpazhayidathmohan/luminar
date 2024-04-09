package oops;

import java.util.Scanner;

interface Bank
{
public void Deposit();
public void Withdraw();
public void Balance();
public void Details();
}
class show implements Bank
{	int Bal=125000;
	int With;
	int Dep;
	int newbal=0;
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void Deposit() {
		System.out.println("Enter the Amount You need to Deposit");
		Dep=sc.nextInt();
		newbal=Bal+Dep;
		System.out.println("Available Balance"+newbal);

		
		

		// TODO Auto-generated method stub
		
	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Amount tou want to withdraw:");
		With=sc.nextInt();
		if(With>newbal)
		{
			System.out.println("Unable to despence money");

		}
		newbal=newbal-With;
		System.out.println("Available Balance is "+newbal);

		
	}

	@Override
	public void Balance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is :"+Bal);

		
	}

	@Override
	public void Details() {
		// TODO Auto-generated method stub
		System.out.println("ACCOUNT DETAILS");
		System.out.println("***************");
		System.out.println("Name:Arun Mohan");
		System.out.println("Account type: Savings");
		System.out.println("Available Balance: "+newbal);



		
	}
	
}
public class Bankinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show s=new show();
		s.Balance();
		s.Deposit();
		s.Withdraw();
		s.Details();

	}

}
