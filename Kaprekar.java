public class Kaprekar {

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        long sq;
        int str2=0;
    
        
        for(int i=99999;i<=q;i++){
            System.out.println(i);
            String s = Integer.toString(i);
            sq = (long)i*i;
            System.out.println(sq);
            if(sq==1){
                System.out.println(1);
            }
            else{
                String str = Long.toString(sq);
                int len = str.length();
          //System.out.println(str);
            String l = str.substring(0,len/2);
            //System.out.println(l);
             String r = str.substring(len/2,len);
          // System.out.println(r);
            int r1 = Integer.parseInt(r);
            if(l.length()!=0){
                str2 = Integer.parseInt(l);
            }
            
            if(((r1+str2) == i)){
                System.out.print(i + " ");
            }
            
            }
        
    }
        }
    public static void main(String[] args) {
        int q=99999;
        int p=1;
        // String str = Integer.toString(q);
        // System.out.println(str.length());
        kaprekarNumbers(p, q);
    }
}
