import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=sc.nextInt();
		System.out.println("Enter the numbers");
		int arr[]=new int[limit];
		int sum=0;
		for(int i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<limit;i++)
		{
			sum=sum+arr[i];
		}System.out.println("Sum="+sum);


	}

}
