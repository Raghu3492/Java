import java.util.ArrayList;
import java.util.List;

public class Nim {
        public static String nimGame(List<Integer> pile) {
    // Write your code here
        int sum=0;
        for(int i=0;i<pile.size();i++){
            sum=sum^pile.get(i);
            System.out.println(sum);
        }
        if(sum>0  ){
            return "First";
        }
        return "Second";
        

    }
    public static void main(String[] args) {
        List<Integer> pile = new ArrayList<Integer>();
        pile.add(3);
        pile.add(2);
        pile.add(4);
        nimGame(pile);

    }
}
