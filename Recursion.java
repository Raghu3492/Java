public class Recursion {

    // static void naturalNum(int n){
    //     if(n==0){
    //       return ;
    //     }
    //     naturalNum(n-1);
    //     System.out.println(n);

    // }

    // static int countNum(int n){
    //     if (n==0){
    //         return 0;
    //     }
    //     return countNum(n/10)+1;

    // }

    // static int sumDigit(int n){
    //         if(n==0){
    //             return 0;
    //         }

    //         return sumDigit(n/10)+n%10;
    // }

    static String revStg(String s,String r,int i){
        if(i<0){
            return r;
        }
        return revStg(s,r+s.charAt(i),i-1);


    }
    public static void main(String[] args) {
        //System.out.println(sumDigit(12345));
        System.out.println(revStg("abcd","",3));
    }

    
}
