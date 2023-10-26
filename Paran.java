
public class Paran {
    public static boolean isValid(String s) {
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i] = s.charAt(i);
            System.out.println(ch[i]);
            
        }
        for( int j=0;j<ch.length;j++){
            for(int k=j+1;j<ch.length;k++){
                if(ch[j]==ch[k]){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
       
    }

    public static void main(String[] args) {
        System.out.println(Paran.isValid("(]"));
        
    }
    
}
