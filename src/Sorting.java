import java.util.Scanner;

/**
 * Created by Amar on 05/05/18.
 */
public class Sorting {

    public static void main(String args[])
    {

        int a [] = {1,3,2,4,5};
//        Scanner input = new Scanner(System.in);
//        for(int i=0;i<a.length;i++) {
//            input.nextLine();
//        }

//        for(int i =1 ; i < a.length;i++) {
//            if (a[i - 1] > a[i])
//            {
//                System.out.println("yes, descending");
//            }
//            else if(a[i-1]<a[i])
//            {
//                System.out.println("yes, ascending");
//            }
//            else
//            {
//                System.out.println("no");
//            }
//        }


        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    System.out.println("yes, descending");
                }
                else if(a[i] < a[j])
                {
                    System.out.println("yes, ascending");
                }
                else
                {
                    System.out.println("no");
                }
            }
        }


    }
}
