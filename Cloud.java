public class Cloud {

    static void jumpingOnClouds(int[] c, int k) {
        int e=100;
        int temp=0;
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
            temp = (temp+k)%c.length;
            e--;

            if(c[i]==1){
                e = e-1-2;
                //System.out.println(e);
            }
            else{
                e-=1;
            }
            
            if(temp==0){
                break;
            }
        }
       System.out.println(e);
       // System.out.println(e);
    }
    public static void main(String[] args) {
        int[] a = new int[]{0, 0, 1, 0, 0, 1, 1, 0};
        jumpingOnClouds(a, 2);
    }
}
