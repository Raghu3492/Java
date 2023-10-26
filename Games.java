import java.util.ArrayList;
import java.util.List;

public class Games {
    public static void howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
        List<Integer> list = new ArrayList<Integer>();
        int sum=0;
        int count=0;
        while(p>=m){
            list.add(p);
           p = p-d; 
        }
      // list.add(p);
        //System.out.println(list);
        for(int i=0;i<m;i++){
            list.add(m);
        }
        System.out.println(list);
        while(sum<=s){
             
             for(int i=0;i<list.size();i++){
                sum = sum+list.get(i);
                //System.out.print(sum +" ");
                if(sum<=s){
                    count++;
                }
            }
        } 
       
       //   list.add(p);
       System.out.println(count);
        
    }
    public static void main(String[] args) {
        int p=89;
        int d=60;
        int m=27;
        int s=7777;
        howManyGames(p, d, m, s);
    }
}
