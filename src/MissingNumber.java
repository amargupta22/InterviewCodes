import java.util.Arrays;

/**
 * Created by Amar on 04/05/18.
 */
public class MissingNumber {

    public static void main(String args[]){

        int [] a = {1,2,3,4,6};

        int missingNumber = getMissingNumber(a,6);
        System.out.println("Array is: " + Arrays.toString(a) + " " + missingNumber);

    }

    private static int getMissingNumber(int[] a, int i) {
        int actualTotal = 0;
        int expectedTotal = (i * (i+1)/2);

        for(int i1 : a)
        {
            actualTotal = actualTotal + i1;
        }

        return expectedTotal - actualTotal;
    }
}
