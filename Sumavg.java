public class Sumavg {
    public static void average(int[] salary) {
        int sum=0;
        for(int i=0;i<salary.length;i++){
            for(int j=i+1;j<salary.length;j++){
                if(salary[i]>salary[j]){
                    int temp = salary[i];
                   salary[i]=salary[j];
                    salary[j]=temp;
                    
                }
            }
        }
        for(int i=1;i<(salary.length-1);i++){
            System.out.println(salary[i]);
        }

        // for(int i=1;i<salary.length-2;i++){
        //     sum = (sum+salary[i])/2;
        // }
        // return sum;
        
    }
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        Sumavg.average(salary);
    
}
}
