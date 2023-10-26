import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Magic
 */
public class Magic {
    public static void formingMagicSquare(List<List<Integer>> s) {
    // Write your code here
    int middle = s.get(1).get(1);
    System.out.println(middle);
    

    }
    public static void main(String[] args) {
        List<List<Integer>> ar = new ArrayList<List<Integer>>();
        ar.add(0,new ArrayList<>(Arrays.asList(5,3,4)));
        ar.add(1,new ArrayList<>(Arrays.asList(1,5,8)));
        ar.add(2,new ArrayList<>(Arrays.asList(6,4,2)));
        formingMagicSquare(ar);
    }
}