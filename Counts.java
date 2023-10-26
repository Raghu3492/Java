import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Counts {
    public static void countingSort(List<Integer> arr) {
    // Write your code here
    int count=0;
    int temp=0;
    List<Integer> result = new ArrayList<Integer>();
    Integer max = Collections.max(arr);
    System.out.println(arr);
    System.out.println(max);
    for(int i=0;i<=max;i++){
        result.add(0);
    }
    System.out.println(result);
   // while(temp!=arr.size()){
    temp = 1;
    for(int j=0;j<arr.size();j++){
        //count=0;
    if(arr.get(j)!=temp){
        count =0;
    }
    result.add(arr.get(j),count+=1);
    temp=arr.get(j);


       
   // }
}


    System.out.println(result);
    

    // Collections.reverseOrder(arr);
    //     for(int i=0;i<arr.size();i++){
    //         count=0;
    //         for(int j=0;j<arr.size();j++){
    //             if(arr.get(i)==arr.get(j)){
    //                 count++;
    //             }
                
    //         }
    //         result.add(count-1);
            
      //  }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        countingSort(arr);

    }
}
