import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diag {

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum=0;
    int sum1=0;
    int len = arr.size();
   // System.out.print(arr.get(0).get(0) + " ");
    //System.out.println(len);
// for(int i=0;i<arr.size();i++){
//         for(int j=0;j<arr.size();j++){
//         //sum = sum + arr.get(i).get(i);
//         System.out.print(arr.get(i).get(j) + " ");
//         }
//         System.out.println();
//     }

    for(int i=0;i<arr.size();i++){
        //for(int j=0;j<arr.size();j++){
        sum = sum + arr.get(i).get(i);
       // System.out.print(arr.get(i).get(i) + " ");
       // }
    }
    //System.out.println();
    for(int i=0;i<arr.size();i++){
        //for(int j=0;j<arr.size();j++){
        
        len =len-1;
       // System.out.print(arr.get(i).get(len) + " ");
        sum1 = sum1 + arr.get(i).get(len);
        
        // System.out.println(arr.get(1).get(1));
        // System.out.println(arr.get(0).get(0));
       // }
    }
   // System.out.println(sum1);
    if(sum1>sum){
        return sum1-sum;
    }
    else{
return sum-sum1;
    }
    }
    
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
       // arr.add(new ArrayList<Integer>());
        // arr.add(0, new ArrayList<>(Arrays.asList(1,2,3)));
        // arr.add(1, new ArrayList<>(Arrays.asList(4,5,6)));
        // arr.add(2, new ArrayList<>(Arrays.asList(9,8,9)));
        arr.add(0, new ArrayList<>(Arrays.asList(6,6,7,-10,9,-3,8,9,-1)));
        arr.add(1, new ArrayList<>(Arrays.asList(9,7,-10,6,4,1,6,1,1)));
        arr.add(2, new ArrayList<>(Arrays.asList(-1,-2,4,-6,1,-4,-6,3,9)));
        arr.add(3, new ArrayList<>(Arrays.asList(-8,7,6,-1,-6,-6,6,-7,2)));
        arr.add(4, new ArrayList<>(Arrays.asList(-10,-4,9,1,-7,8,-5,3,-5)));
        arr.add(5, new ArrayList<>(Arrays.asList(-8,-3,-4,2,-3,7,-5,1,-5)));
        arr.add(6, new ArrayList<>(Arrays.asList(-2,-7,-4,8,3,-1,8,2,3)));
        arr.add(7, new ArrayList<>(Arrays.asList(-3,4,6,-7,-7,-8,-3,9,-6)));
        arr.add(8, new ArrayList<>(Arrays.asList(-2,0,5,4,4,4,-3,3,0)));
        // arr.get(0).add(0,1);
        // arr.get(0).add(1,2);
        // arr.get(0).add(2,3);
        // arr.get(0).add(0,4);
        // arr.get(0).add(1,5);
        // arr.get(0).add(2,6);
        // arr.get(0).add(0,9);
        // arr.get(0).add(1,8);
        // arr.get(0).add(2,9);
       // arr.get(0).add(0,2);

        
       // diagonalDifference(arr);

        System.out.println(diagonalDifference(arr));
    }
}
