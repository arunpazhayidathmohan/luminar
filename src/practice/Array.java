package practice;

public class Array {

	public static void main(String[] args) {
		//Does store homogenous data. not grewable,
		//single and multi dimensional array
		//dataType[] arr(),datatype[]arr,dataType arr[] eg:int[] arr;
		//datatype[] arrayreferencename=new datatype{size];
		//int[] arr= new int[3];
		//ar.length for finding the length no () required
		//
		
		int[] arr = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		for( int i=0;i<4;i++)
		{
			System.out.println("Array="+arr[i]);

		}
	}

}
