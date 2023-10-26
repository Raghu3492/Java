public class Wigg {
    public static void wiggleMaxLength(int[] nums) {
        int[] arr = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
           arr[i]=nums[i+1]-nums[i];
        }
        System.out.println(arr[5]);
        
    }
public static void main(String[] args) {
    int[] nums = {1,7,4,9,2,5};
    Wigg.wiggleMaxLength(nums);
}
    
}
