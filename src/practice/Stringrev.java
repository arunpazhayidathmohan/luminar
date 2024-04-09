package practice;

public class Stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing Training Center";
		System.out.println("The input is "+s);
		String[] words=s.split(" ");
		String rev=" ";
		for(int i=words.length-1;i>=0;i--)
		{
			String word=words[i];
			rev= rev+word+" ";
		}
		String res=rev.trim();
		System.out.print(res);	
	}

}
