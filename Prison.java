import java.util.ArrayList;
import java.util.List;

public class Prison {

    public static void saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int res = (m+s-1)%n;
        if(n==0){
            System.out.println(n);
        }
        System.out.println(res);
        
        }
    public static void main(String[] args) {
        int n=4;
        int m=6;
        int s=2;
        saveThePrisoner(n,m,s);
    }
}
