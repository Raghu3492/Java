import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.io.*;

public class Sticks {

    public static void cutTheSticks(List<Integer> arr) {
    // Write your code here
   
    arr.removeAll(Collections.singleton(0));// remove all zeroes if present
     Collections.sort(arr); // sort in ascending order
        while(arr.size()>0)
        {
            int smallest = arr.get(0);  // get the smallest element
            for(int i =0 ;i < arr.size();i++)
            {

                arr.set(i, arr.get(i) - smallest);
            }
            //System.out.println(list);
            System.out.println(arr.size());
            arr.removeAll(Collections.singleton(0)); // remove the elements which are zero after cutting the sticks
            //System.out.println(list);
        }


        
    
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(5,4,4,2,2,8));
        cutTheSticks(arr);
        //System.out.println(cutTheSticks(arr));
    }
}
