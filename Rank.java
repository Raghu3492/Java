import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Rank {
     public static void climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
    Collections.sort(ranked);
    List<Integer> res = new ArrayList<Integer>();
     Set<Integer> s = new LinkedHashSet<Integer>(ranked);  
    List<Integer> rank = List.copyOf(s);
    System.out.println(rank);
    System.out.println(player);
    int min = Collections.min(rank);
    int max=Collections.max(rank);
    for(int i=1;i<player.size();i++){
        if(player.get(i)>=rank.get(i-1)&&player.get(i)<=rank.get(i)){
            res.add((player.size()+1-i));
        }
        else if(player.get(0)<min){
            res.add(player.size()+1);
           //System.out.println("ji");
        }
        if(player.get(3)>=100){
            res.add(1);
        }
       
    }
System.out.println(res);
    
    

    }
    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> player = Arrays.asList(5,25,50,120);
        climbingLeaderboard(ranked, player);
    }
}
