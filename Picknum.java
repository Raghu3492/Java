import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Picknum {
    public static void pickingNumbers(List<Integer> a) {
        // Write your code here
        int max=0;
        int count=0;
        Collections.sort(a);
        Collections.reverse(a);
        for(int i=0;i<a.size();i++){
            count=0;
            for(int j=i;j<a.size();j++){
                if(a.get(i)-a.get(j)==1 ||a.get(i)-a.get(j)==0 || a.get(i)-a.get(j)==-1){
                    //System.out.println(a.get(i)-a.get(j));
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
        }
        System.out.println(max);
            
        }
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<Integer>(Arrays.asList(4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,2,98,3,9,9,3,1,4,1,98,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4));
        pickingNumbers(n);
    }
}
