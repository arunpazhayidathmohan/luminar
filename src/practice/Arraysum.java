package practice;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        // Print the sum
        System.out.println("Sum of the elements in the array: " + sum);

        sc.close();
		

		
	}
	
	
	

}
