public class Binnum {

    public static void countBits(int n) {

        int[] temp = new int[n+1];
        int num;

        for(int i=0;i<temp.length;i++){
           String res = Integer.toBinaryString(i);
           //System.out.println(res);
        temp[i] = Integer.parseInt(res);
        
        
           
            
        }
        
    }

    public static void main(String[] args) {
        Binnum.countBits(2);
    }
    
}
