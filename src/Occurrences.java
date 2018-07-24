import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amar on 31/05/18.
 */
public class Occurrences {

    public static void main(String args[]){

        String s = "ram ghar ram jata hai ram hai";
               Map<String,Integer> occurence = new HashMap<String,Integer>();

        String [] splitWords = s.split(" ");
        for ( String word : splitWords ) {
            Integer oldCount = occurence.get(word);
            if ( oldCount == null ) {
                oldCount = 0;
            }
            occurence.put(word, oldCount + 1);
        }

        System.out.println(occurence.get("ram"));
    }
}
