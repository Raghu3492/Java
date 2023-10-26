import java.util.Scanner;

public class Camel {
    
    public static void camelCase(String inp){
        if(inp.charAt(0)=='S' && inp.charAt(2)=='M'){
            String S = inp.substring(4, inp.length()-2);
            String[] str = S.split("(?=\\p{Lu})");
            System.out.println(str[0] + " " + str[1].toLowerCase());
        }
        else if(inp.charAt(0)=='C' && inp.charAt(2)=='V'){
            String S = inp.substring(4, inp.length());
            String spac;
            String spac1;
            String letup;
            
            for (int i = 0; i < S.length(); i++) {
                if(S.charAt(i) == ' '){
                    spac = S.substring(i+1,S.length());
                    letup = spac.substring(0,1).toUpperCase();
                    String remainingLetters = spac.substring(1, spac.length());
                    spac1 = S.substring(0, i);
                    System.out.print(spac1+letup+remainingLetters);
                }

                
            }
        }
            else if(inp.charAt(0)=='C' && inp.charAt(2)=='C'){
            String S = inp.substring(4, inp.length());
            String spac;
            String spac1;
            String letup;
            
            for (int i = 0; i < S.length(); i++) {
                if(S.charAt(i) == ' '){
                    String one = S.substring(0, i);
                    String start = one.substring(0, 1).toUpperCase();
                    String remainingLetters1 = one.substring(1, one.length());
                    String res1 = start+remainingLetters1;
                    spac = S.substring(i+1,S.length());
                    letup = spac.substring(0,1).toUpperCase();
                    String remainingLetters = spac.substring(1, spac.length());
                    spac1 = S.substring(0, i);
                    System.out.print(res1+letup+remainingLetters);
                }

                
            }
            
        }
        else if(inp.charAt(0)=='S' && inp.charAt(2)=='C'){
            String S = inp.substring(4, inp.length());
            String[] string = S.split("(?=\\p{Lu})");
            System.out.println(string[0].toLowerCase() + " " + string[1].toLowerCase()+ " " + string[2].toLowerCase());

        }
        
        else if(inp.charAt(0)=='C' && inp.charAt(2)=='M'){
            String S = inp.substring(4, inp.length());
            String pre;
            String st;
            String c;
            String remaining;
            String ans;
            for (int i = 0; i < S.length(); i++) {
                S.trim();
                if(S.charAt(i) == ' '){
                    //pre = S.substring(0,i);
                    
                   st = S.substring(i+1,S.length());
                   
                   c = st.substring(0, 1).toUpperCase();
                   
                   remaining = st.substring(1, st.length());
                   
                  pre = c+remaining;
                 System.out.println(c);
            

                }
                 
                
   
            }
            
            
        }
            
        }
    

    public static void main(String[] args) {
        // try (Scanner input = new Scanner(System.in)) {
        //     System.out.println("Input the string : ");
        //     String inp = input.nextLine();
        //     camelCase(inp);
        // }
         String inp = "C;M;white sheet of paper";
           camelCase(inp);
    }
}
