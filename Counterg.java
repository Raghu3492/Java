import java.util.*;
import java.io.*;

public class Counterg{

    public static void main(String[] args) {
        int count=0;
        int c=0;
        int n=6;
        double pow = Math.log(n)/Math.log(2);

        while(pow%1 !=0){
            n-=1;
            c++;
        pow = Math.log(n)/Math.log(2);
        }
        count++;
       // System.out.println(count);
        while(c!=1){
            count++;
            //System.out.println(n);
            pow = Math.log(c)/Math.log(2);
            if(pow%1==0){
                c=c/2;
                
                
            }
        }
        System.out.println(count);
        

    }
}