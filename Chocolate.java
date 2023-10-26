public class Chocolate {
    public static void chocolateFeast(int n, int c, int m) {
        // Write your code here
        int wrapper = n/c;
        int tc;
        int wc;
        int wcr;
        int sum=wrapper;
        while(wrapper>=m){
            
             wc = wrapper/m;
             sum=sum+wc;
            int wr = wrapper%m;
            wrapper =wc+wr;
        }
        System.out.println(sum);
        
        
        }
    
    public static void main(String[] args) {
        chocolateFeast(10, 2, 5);
    }
}
