import java.util.ArrayList;
import java.util.List;

public class BreakingRec {

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
            int min = scores.get(0);
            int max = scores.get(0);
            int countA=0;
            int countB=0;
            List<Integer> res = new ArrayList<Integer>();
            
            for(int i=1;i<scores.size();i++){
                if(scores.get(i)>max){
                    max = scores.get(i);
                    countA++;
                }
                else if(scores.get(i)<min){
                    min = scores.get(i);
                    countB++;
                }
            }
        res.add(countA);
        res.add(countB);
        return res;
    }

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<Integer>();
        scores.add(12);
        scores.add(24);
        scores.add(10);
        scores.add(24);
        System.out.println(breakingRecords(scores));
        
    }
}
