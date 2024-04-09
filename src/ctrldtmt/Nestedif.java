package ctrldtmt;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Age=18,weight=55;
		if(Age>=18) {
			if(weight>=55)
			{
				System.out.println("Eligible for Donation");

			}else {
				System.out.println("Does not meet eligible weight");

			}
		}
			else
			{
				System.out.println("Not Eligible");

			}
	}

}
