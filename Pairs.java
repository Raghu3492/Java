import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pairs {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count=0;
        Collections.sort(ar);
        System.out.println(ar);
        for(int i=0;i<n-1;i++){
           // System.out.println(i);
                if(ar.get(i)==ar.get(i+1)){
                count++;
                    //i+=1;
                   // System.out.println(i);
            }
            
            
        }
        return count;
    
        }

    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5);
        // ar.add(1);
        // ar.add(2);
        // ar.add(1);
        // ar.add(2);
        // ar.add(1);
        // ar.add(3);
        // ar.add(2);
        int n =20;
        //sockMerchant(n,ar);
        System.out.println(sockMerchant(n,ar));


    }
}
