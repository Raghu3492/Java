import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Alphanum {
    public static String numStr(String s){
       // int one =1;

       
        String[] words = s. split(" ");
        List<Character> res = new ArrayList<Character>();
        HashMap<String,Character> store = new HashMap<String,Character>();
        store.put("one", '1');store.put("two", '2');store.put("three", '3');store.put("four", '4');store.put("five", '5');
        // store.put("six", 6);store.put("seven", 7);store.put("eight", 8);store.put("nine", 9);
        store.put("zero", '0');
        for(int i=0;i<words.length;i++){
            if(words[i].equals("one")){
                //store.get("one");
                //System.out.print(store.get(words[i]));
                res.add(store.get(words[i]));
            }
            else if(words[i].equals("double")){
                store.get(words[i+1]);
                //System.out.print(store.get(words[i+1]));
                res.add(store.get(words[i+1]));
            }
            else if(words[i].equals("triple")){
                store.get(words[i+1]);
                //System.out.print(store.get(words[i+1]));
                //System.out.print(store.get(words[i+1]));
                res.add(store.get(words[i+1]));
                res.add(store.get(words[i+1]));
            }
            else if(words[i].equals("two")){
                //store.get("one");
                //System.out.print(store.get(words[i]));
                res.add(store.get(words[i]));
            }
            else if(words[i].equals("three")){
                    //System.out.print(store.get(words[i]));
                    res.add(store.get(words[i]));
                }
                else if(words[i].equals("zero")){
                    //System.out.print(store.get(words[i]));
                    res.add(store.get(words[i]));
                }
               
               
        }
         StringBuilder sb = new StringBuilder();
         for(Character ch : res){
            sb.append(ch);
         }
         String str =sb.toString();
          return str;
        
    }
    public static void main(String[] args) {
        String s = "one double two triple three zero one triple zero";
        System.out.println(numStr(s));
        //numStr(s);
    }
}
