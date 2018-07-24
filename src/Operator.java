

import java.io.File;
import java.util.*;


    public class Operator {

        public static void totalCost(double meal_cost, int tip_percent, int tax_percent){
            double total_cost = Math.round(meal_cost + (meal_cost*tip_percent)/100 + (meal_cost*tax_percent)/100);

            System.out.println(total_cost);


        }

        public static int Rtfcounter=0;


        public static void main(String[] args) {



//            File fs[] = new File("/Users/GROFERS/Documents/Amar").listFiles();
//          int count =  fs.length;
//
//          System.out.println("No. of files "+count);
//            String fileName = fs[0].getName();
//
//            int c=0;
//            int docCounterm=0;
//            for (File f:fs
//                 ) {
//                if(f.getName().toLowerCase().contains(".rtf"))
//                    Rtfcounter++;
//
//                if(f.getName().toLowerCase().contains(".docx"))
//                    docCounterm++;
//            }
//
//
//
//
//
//            System.out.println("Rtf No. of files"+Rtfcounter);
            int counter = countNoOfFiles("/Users/GROFERS/Documents/Amar");
            System.out.println("Total No. of files"+ counter);

        }

        public static int countNoOfFiles(String path)
        {
            File fs[] = new File(path).listFiles();
//            int count =  fs.length;

//            System.out.println("No. of files "+count);
//            String fileName = fs[0].getName();

            //int docCounterm=0;
            for (File f:fs
                    ) {
                if(f.isFile())
                    Rtfcounter++;
                else if(f.isDirectory())
                    countNoOfFiles(f.getAbsolutePath());
            System.out.println(f.getName());
            }
            return Rtfcounter;


        }
    }

