import java.util.Scanner;

/**
 * Created by Amar on 04/05/18.
 */
public class ReverseString {

    public static void main(String args[]){
        String input,reverse="";

        System.out.println("Enter input string:");
        Scanner in = new Scanner(System.in);
        input = in.nextLine();

        System.out.println("Enter input string:" + input);

        for (int i = input.length()-1; i>=0;i--){
            reverse=reverse+input.charAt(i);
        }

        System.out.println("Reverse string:" + reverse);

    }
}
