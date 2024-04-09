package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {

	public static void main(String[] args) throws FileNotFoundException  {
		FileInputStream fl=new FileInputStream("E:arun.docs");
		int a=50,b=0;
		try {
			int c=a/b;
		}catch (Exception e)
		{
			System.out.println(e.getMessage());

		}
		System.out.println("Are u a mandan dividing number by zero");
		String s=null;
		try {
		System.out.println(s.length());

		}catch(Exception e) {
			System.out.println(e.getMessage());

		}
		System.out.println("Pottatharam kaanikkathedaaaa :) ");


	}

}
/*Built in exception
 * 
 * Throwable 
 *
 * Exception
 *Arithmetic Exception
 *Classnotfound Exception 
 *file not found Exception
 *
 *Exception 2 type
 *compile time exception-checked exception: Classnotfound Exception/i-o exception/file not found Exception
 *runtime exception-unchechked:Arrayindexboundofexception/arithmeticexception/nullpointerexception
 *
 * 
 * 
 * 
 */