package practice;

public class OddnumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd Numbers are");
		for(int i=1;i<=99;i++)
		{
			if(i%2==1)
			{
				i=i++;
				
				System.out.print(i+",");


			}
		}
	}

}
