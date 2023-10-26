public class Power {

    public static void numCons(int a){
        //System.out.println(Math.log(a)/Math.log(2));
        double res;
        for(int i=1;i<=a;i++){
            res = (Math.log(i)/Math.log(2));
            if(res%1==0){
                System.out.println("power");
            }
            else{
                System.out.println(i);
            }
        }

        
//         for(int i=1;i<=a;i++){
//             if(Math.log(i)==0){
//                 System.out.println(i);
//             }

//            if(i != 0 && ((i & (i - 1)) == 0)){
//             System.out.println("Power");
//            }
//            else{
// System.out.println(i);
//            }
            

//         }
    }
    public static void main(String[] args) {
        int a =8;
        numCons(a);
    }
}
