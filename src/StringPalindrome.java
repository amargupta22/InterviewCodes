/**
 * Created by Amar on 04/05/18.
 */
public class StringPalindrome {
    public static void main(String args[]){

        String input = "RAMARn";
        String reverse = "";

        for (int i = input.length()-1; i>=0;i--){
            reverse=reverse+input.charAt(i);
        }

        if(input.equals(reverse))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

    }
}
