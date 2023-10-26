public class Russian {

    public static String dayOfProgrammer(int year) {
        // Write your code here
            String sy = Integer.toString(year);
            if(year%4==0){
                return "12.09."+sy;
            }
            else{
                return "13.09."+sy;
            }
        }
    
    
    public static void main(String[] args) {
        int year = 2016;
        // dayOfProgrammer(year);
        System.out.println(dayOfProgrammer(year));
    }
}

