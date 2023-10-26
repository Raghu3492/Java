//import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Birds {

     public static void migratoryBirds(List<Integer> arr) {
    // Write your code here
    int counto=0,countt=0,countth=0,countf=0,countfi=0;
    int result;
       HashMap<Integer,Integer> mapb=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.size();i++){
                if(arr.get(i)==1){
                    counto++;
                }
                else if(arr.get(i)==2){
                    countt++;
                }
                else if(arr.get(i)==3){
                    countth++;
                }
                else if(arr.get(i)==4){
                    countf++;
                }
                else{
                    countfi++;
                }
                
        }
        mapb.put(1,counto);mapb.put(2,countt);mapb.put(3,countth);mapb.put(4,countf);mapb.put(5,countfi);
        Integer c = Collections.max(mapb.values());
        
      Arrays.asList(mapb);
      for(int i=0;i<mapb.size();i++){
        if(mapb.get(i)==c){
            result =i;
            break;
        }
      }
      
        
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        migratoryBirds(arr);
    }
}
