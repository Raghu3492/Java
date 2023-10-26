public class TimeCon {

    public static String timeConversion(String s) {
        // Write your code here
           // System.out.println(s.length());
           int sum=0;
            if(s.charAt(8) == 'P'){
                String t = s.substring(0,2);
                int hr = Integer.parseInt(t);
                sum = 12+hr;
                if(sum == 24){
                    
                //String c = b + (s.substring(2, 8));
                return "12" + (s.substring(2, 8));
                }

                //System.out.println(12+hr);
                String b = Integer.toString(sum);
                //String c = b + (s.substring(2, 8));
                return b + (s.substring(2, 8));
                
            }
            else{
                String t = s.substring(0,2) ;
                int hr = Integer.parseInt(t);
                sum = 12+hr;
                if(sum == 24){
                    
                //String c = b + (s.substring(2, 8));
                return "00" + (s.substring(2, 8));
                }

                return (s.substring(0,8));
            }
        }
    public static void main(String[] args) {
        String s = "12:45:54PM";
        System.out.println(timeConversion(s));
    }
}
