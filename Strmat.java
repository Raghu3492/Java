import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Strmat {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
            
        for(int i=0;i<queries.size();i++){
            int count=0;
            for(int j=0;j<strings.size();j++){
                if(queries.get(i).equals(strings.get(j))){
                    count++;
                }
            }
            res.add(count);
        }
        return res;
                   // result.remove(j);
 }
                


    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        List<String> queries = new ArrayList<String>();
        // strings.add("aba");
        // strings.add("baba");
        // strings.add("aba");
        // strings.add("xzxb");
        // queries.add("aba");
        // queries.add("xzxb");
        queries.add("ab");
        strings.add("def");
        strings.add("de");
        strings.add("fgh");
        //strings.add("xzxb");
        queries.add("de");
        queries.add("lmn");
        queries.add("fgh");
       // matchingStrings(strings,queries);
        // strings.add("abcde");
        // strings.add("sdaklfj");
        // strings.add("asdjf");
        // strings.add("na");
        // strings.add("basdn");
        // strings.add("sdaklfj");
        // strings.add("asdjf");
        // strings.add("na");
        // strings.add("asdjf");
        // strings.add("na");
        // strings.add("basdn");
        // strings.add("sdaklfj");
        // strings.add("asdjf");
        // //strings.add("xzxb");
        // queries.add("abcde");
        // queries.add("sdaklfj");
        // queries.add("asdjf");
        // queries.add("na");
        // queries.add("basdn");
        System.out.println(matchingStrings(strings,queries));


        
    }
}
