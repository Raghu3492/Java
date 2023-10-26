public class Palindrome {

    public static void isPalindrome(int x) {
        int sum=0;
        int temp=x;
        while(x!=0){
        x=x%10;//1//2//1
        sum=(sum*10)+x;//1//12//121
        x=x/10;//12//1//0
        }
        System.out.println(sum);
    //    if(sum==temp){
    //        return sum;
    //    }
    //    else{
    //        return sum;
    //    }
    }

    public static void main(String[] args) {
        Palindrome.isPalindrome(121);
    }
    
}
