public class Div {
    public static int findDigits(int n) {
        // Write your code here
        int sum=0;
        int a=n;
        int count=0;
        while(a!=0){
            int rem = a%10;
            if(rem!=0){
                if(n%rem==0){
                count++;
                }
                
            }
             a = a/10;
            sum=sum*10+rem;
        }
       
        return count;
        }
    public static void main(String[] args) {
        int n=1207;
        System.out.println(findDigits(n));
    }
}
