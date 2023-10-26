import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpCloud {
    public static void jumpingOnClouds(List<Integer> c) {
    // Write your code here
    List<Integer> r = new ArrayList<Integer>();
    int count=0;
    int i=0;
    while(i != c.size()-1)
    {
        if(i != c.size() - 2 && c.get(i+2) == 0)
       
            i+=2;
            
        else
            i++;
        count++;
    }   
    System.out.println(count);
    }
    public static void main(String[] args) {
        List<Integer> c = Arrays.asList(0,1,0,0,0,1,0);
        jumpingOnClouds(c);
    }
}
