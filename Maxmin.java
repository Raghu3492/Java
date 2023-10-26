import java.util.*;

class Maxmin{

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minSum = 0;
        long maxSum = 0;
        long sum = 0;
        ArrayList<Long> res = new ArrayList<Long>();
        
        for(int i=0;i<arr.size();i++){
            sum =0;
            for(int j=0;j<arr.size();j++){
                sum = arr.get(j) + sum; 
            }
            sum = sum -arr.get(i);
            //System.out.println(sum);
            res.add(sum);



            //long temp =sum;
            // if(temp>maxSum){
            //         maxSum =sum;
            //         //minSum=sum;
                    
            //     }
            //     else if(sum<minSum || minSum==0){
            //         minSum = sum;
            //     }
            
                
        }
        Collections.sort(res);
        minSum = res.get(0);
        maxSum = res.get(res.size()-1);
       System.out.println(minSum +" "+ maxSum);
        }


    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(769082435);
        l.add(210437958);
        l.add(673982045);
        l.add(375809214);
        l.add(380564127);
        miniMaxSum(l);

        
    }
}