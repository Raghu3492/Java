import java.util.Arrays;
import java.util.List;

public class Sama {
     public static void beautifulTriplets(int d, List<Integer> arr) {
    // Write your code here
    int count=0;
    int i=0;
    System.out.println(arr.size()/2+1);
    while(i<=(arr.size()/2+1)){
                System.out.println(arr.get(i+1)-arr.get(i) +" "+ (arr.get(i+2)-arr.get(i+1)));
                if((arr.get(i+1)-arr.get(i)) == (arr.get(i+2)-arr.get(i+1))){
                    if((arr.get(i+1)-arr.get(i))==d){
                        count++;
                    }
                }
        
        i++;
    }
    System.out.println(count);
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,4,5,7,8,10);
        int d=1;
        beautifulTriplets(d, arr);
    }
}
