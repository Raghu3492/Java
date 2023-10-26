public class Taum {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long v;
       long u = (long)b;
       long c= (long)w;
       long a = (long)bc;
       long x = (long)wc;
       long y = (long)z;
       // System.out.println(714782523241122198);
        if(bc+z<wc)
        {
            v =((u*a)+(c*a)+(c*y));
            //System.out.println("one");
         return v;
        }
      else if(wc+z<bc)
        {
         v= ((u*x)+(c*x)+(u*y));
         //System.out.println("two");
         return v;
        }
        else if(bc==wc)
           { 
             v= ((u*a)+(c*x));
             //System.out.println("three");
             return v;
          }
        else
          {
             v= ((u*a)+(c*x));
            // System.out.println(v);
             return v;
          }
        }

    public static void main(String[] args) {
        int b=384;
        int w=887;
        int bc=2778;
        int wc=6916;
        int z=7794;
        b=443463982; w=833847400;
bc=429734889; wc=628664883;z= 610875522;
        
        //taumBday(b, w, bc, wc, z);
        System.out.println(taumBday(b, w, bc, wc, z));
    }
    
}
