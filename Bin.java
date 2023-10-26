class Bin{
    public static void addBinary(String a, String b){
        int sum=0;
        int num1 = Integer.parseInt(a, 2);
        
 
        int num2 = Integer.parseInt(b, 2);

       // sum =num1+num2;

        String res = Integer.toBinaryString(num1+num2);
        System.out.println(res);

    }


    public static void main(String[] args) {
        Bin.addBinary("1010", "1011");

    }
}