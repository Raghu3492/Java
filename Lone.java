import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lone {

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
     Collections.sort(a);
     
    int i=0;
    if(a.size()%2!=0){
        a.add(0);
    }
    while(i<a.size())
    {
        //System.out.println("pt");
       
        if(a.get(i)!=a.get(i+1))
        {
            return a.get(i);
        }
        //  if(i>=a.size()){
        //     break;
        // }
        i=i+2;
        
    }
     
    return 0;
    }


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(1);
        //lonelyinteger(a);
        System.out.println(lonelyinteger(a));
    }
}
