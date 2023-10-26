import java.util.ArrayList;
import java.util.List;

public class Rnd {
    public static void gradingStudents(List<Integer> grades) {
        // Write your code here
        int i=0;
        List<Integer> result = new ArrayList<Integer>();
            while(i<grades.size()){
                if(grades.get(i)>=35){
                    if(grades.get(i)%5>=3){
                       int tep = ((grades.get(i)/5) + 1)*5;
                       result.add(tep);
                    }
                    else{
                        result.add(grades.get(i));
                    }
                }
                else{
                    result.add(grades.get(i));
                }
                i++;
            }
            System.out.println(result);
        }
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
       gradingStudents(grades);
    }
}
