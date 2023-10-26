import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Countstep {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count=0;
        int valley=0;
           // char[] ch = path.toCharArray();
            
            for(int i=0;i<path.length();i++){
                if(path.charAt(i)=='U'){
                    count=count+1;
                    
                    System.out.print("_");
                }
                else if(path.charAt(i)=='D'){
                    if(count==0){
                        valley=valley+1;    
                    }
                    count=count-1;
                    
                    
                    System.out.print("+");
                }
            }
           
            return valley;
        }
    public static void main(String[] args) {
        String path = "UDDDUDUU";
        System.out.println(countingValleys(8,path));

    }
}
