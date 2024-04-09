package practice;

public class Stringupdate {
    public static void main(String[] args) {
        String input = "java 3.0";
        System.out.println(input);

        String[] parts=input.split(" ");
        String Result=parts[0]+" Tutorial "+parts[1];
        System.out.println(Result);

        
    }
}
