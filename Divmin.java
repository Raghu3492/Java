import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divmin {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        Collections.sort(ar);
    // Write your code here
    int count=0;
        for(int i=0;i<n;i++){
            //System.out.print(ar.get(i));
            for(int j=0;j<n;j++){
                 
                if(ar.get(i)<ar.get(j) && ((ar.get(i)+ar.get(j))%k ==0)){
                    
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        int n = 6;
        int k=3;
        //divisibleSumPairs(n, k, ar);
        System.out.println(divisibleSumPairs(n, k, ar));
    }
    
}
