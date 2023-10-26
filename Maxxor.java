public class Maxxor {

    public static void main(String[] args) {
        long n=1000000000000000L;

        for(int i=0;i<n;i++){
            long s = n|i;
             System.out.println("10^" +i + "->"+ s);
        }
       
    }
}
