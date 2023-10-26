import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ACM {

     public static void acmTeam(List<String> topic) {
    // Write your code here
   // List<Integer> result = new ArrayList<Integer>();
     List<Integer> len = new ArrayList<Integer>();
    int count=0;
    int max =0;
    int team ;
        for(int i=0;i<topic.size();i++){
            
            for(int j=i+1;j<topic.size();j++){
                count=0;
                for(int k=0;k<topic.get(i).length();k++){
                    if(topic.get(i).charAt(k)=='1'|| topic.get(j).charAt(k)=='1'){
                        count++;
                    }

                }
                len.add(count);
                if(max<count){
                max=count;
            }
                    
            }
            
        }
       // System.out.println(max);
//                 result.clear();
//                 count=0;
//                // team=1;
//                  BigInteger s = new BigInteger(topic.get(0),2);
//                  BigInteger t = new BigInteger(topic.get(0),2);
//                  //BigInteger ador = s|t;
//                  BigInteger str = new BigInteger(s|t);
// assertEquals(ador, ador.toString());
//                 // String str = Long.toBinaryString(ador);
//                  for(int k=0;k<str.length();k++){
//                     if(str.charAt(k)=='1'){
//                         result.add(k+1);
//                         count++;
//                     }
//                     if(max<=count){
//                         max=count;
                    
//                     }
                     
//                  }
//                 len.add(result.size());

//                  System.out.println(result);
                 
//             }

            
//             // System.out.println(topic.get(i));

//         }
        team=Collections.max(len);
        int r =0;
        for(int i=0;i<len.size();i++){
            if(len.get(i)==team){
                r++;
            }
        }
       System.out.println(max);
       System.out.println(r);

    }
    public static void main(String[] args) {
        //List<String> topic = Arrays.asList("1001101111101011011100101100100110111011111011000100111100111110111101011011011100111001100011111010",
        //"1111010101101010011101101101011101111111111011110010001001100111000111011111101110010111110111110010");
       List<String> topic = Arrays.asList("10101",
       "11110",
       "00010");
        acmTeam(topic);
       //int s = Integer.parseInt(topic.get(0),16);
       //BigInteger m = Integer.parseInt(topic.get(0),2);
      // BigInteger result = new BigInteger(topic.get(0),2);

      // System.out.println(result);
       //System.out.println(BigInteger.valueOf(topic.get(0),2));   parseLong(topic.get(0),2));
    }
}
