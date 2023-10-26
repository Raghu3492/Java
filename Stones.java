import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stones {
    public static List<Integer> stones(int n, int a, int b) {
    int sum =0;
    int ss=0;
    if(b>a){
        int t =b;
        b=a;
        a=t;
    }
    List<Integer> re = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            sum =sum+a;
        }
        re.add(sum);
        int diff =b-a;
        for(int i=0;i<n-1;i++){
            sum=sum+diff;
            re.add(sum);
        }
        Collections.reverse(re);
        return re;
    }
    public static void main(String[] args) {
        int n=73;
        int a=25;
        int b=25;
        System.out.println(stones(n, a, b));

    }
}
