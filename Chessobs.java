import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chessobs {

     public static void queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    // Write your code here
    int sum1=0;
    int sum2=0;
    int sum3=0;
    if((r_q==c_q)||(r_q==n && c_q==1)||(r_q==1 && c_q==1)||(c_q==n && r_q==1)){
        for(int i=n-1;i>0;i--){
            if(obstacles.size()==0){
                sum1++;
            sum2++;
            sum3++;
            }
            else{
                
            }
            
        }
        System.out.println(sum1+sum2+sum3);
    }

    }
    public static void main(String[] args) {
        int n =4;
        int k=0;
        int r_rq=4;
        int c_rq=4;
        List<List<Integer>> obstacles = new ArrayList<List<Integer>>();
        obstacles.add(0,new ArrayList<>(Arrays.asList(3,3)));
        // System.out.println(obstacles);
        queensAttack(n, k, r_rq, c_rq, null);

    }
}
