import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotat {
    public static void circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int last =a.get(a.size()-1);
        int p=0;
        List<Integer> res = new ArrayList<Integer>();
       // int[] ar = new int[a.size()];
        int[] ar = a.stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
        
        while(p!=k){
        for(int i=a.size()-1;i>0;i--){
            
           ar[i]=ar[i-1];
        }
        ar[0]=last;
        last =ar[ar.length-1];
            p++;
        }
        for(int i=0;i<queries.size();i++){
            res.add(ar[queries.get(i)]);
        }
        System.out.println(res);
        }
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(3,4,5);
        int k=2;
        List<Integer> queries= Arrays.asList(1,2);
        circularArrayRotation(a, k, queries);
    }
}
