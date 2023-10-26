public class SquareNum {

    public static void squares(int a, int b){

        int n = (int)Math.ceil(Math.sqrt(a));

        int n1 = n*n;
        n =(n*2)+1;
        while(n1>=a && n1<=b){
            n1 = n1+n;
            n=n+2;
        }
        System.out.println(n1);
    }
    
    public static void main(String[] args) {
        int a = 24;
        int b=49;
        squares(a,b);
    }
}
