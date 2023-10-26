public class Asc {
    public static int reverseNum(int temp1){
            int sum =0;
            while(temp1!=0){
                    int rev = temp1%10;//0//2
                    sum = (sum*10) + rev;//0+2=2
                    temp1 = temp1/10;//2//0
                }
                return sum;
        }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count=0,temp1;


        
            while(i<=j){
                temp1 = i;//20
                
                int sum = reverseNum(temp1);
               // System.out.println(sum);
                if((i-sum)%k==0){
                    count++;
                }
                
                i++;
                
            }
            return count;
        }
    public static void main(String[] args) {
        int i=20;
        int j=23;
        int k=6;
        //int n = Integer.reverse(a);
        System.out.println(beautifulDays(i,j,k));
    }
}
