public class Dis {
    public static int removeElement(int[] nums, int val) {
       // int[] num=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(Dis.removeElement(nums, 3));
    }
    
}
