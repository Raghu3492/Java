import java.util.*;

public class Minidist{

    public static void setList(List<Integer> list){
        Set<Integer> set1 = new HashSet<Integer>(list); 
        List<Integer> list1 = new ArrayList<Integer>();
       // System.out.println(set1);
        for(int i : set1){
            list1.add(i);
        }
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list.size();j++){
                if(list1.get(i)==list.get(j)){
                    System.out.println(j);
                }
            }
        }
    
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,1,4,5);
        setList(list);

        // for(int i=0;i<list.size();i++){
        //     set.add(i);
        // }
       // System.out.println(set);

    }
}