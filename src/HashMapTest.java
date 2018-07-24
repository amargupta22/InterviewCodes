import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amar on 05/05/18.
 */
public class HashMapTest {

    int c =10;

    public static void main(String args[]) {
    test t = new test();
        HashMapTest hm = new HashMapTest();

        t.a = 5;
        System.out.println(hm.c);
        t.testMethod2();
        t.testMethod();
    }

}

    class test {

        static int a = 0;
        int b = 9;

        void testMethod(){
            a = 10;
            System.out.println(b);

        }

        static void testMethod2(){
           System.out.println(a);
        }
    }
