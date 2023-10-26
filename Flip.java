public class Flip {

    public static void flippingBits(long n) {
        // Write your code here
        Long sum;
        sum = 214748364+n;
        String s = Long.toBinaryString(sum);
        System.out.println(s);
        sum = Long.parseLong(s,2);
        System.out.println(sum);
        
        }
    
    public static void main(String[] args) {
        flippingBits(3);
    }
}
