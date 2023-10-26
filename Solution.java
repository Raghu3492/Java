// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         int[] nums1;
//         int temp=1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]<pivot){
//                nums1 = new int[temp];
//                 nums1[temp-1] = nums[i];
//                 //System.out.println(nums1[temp-1]);
//                 temp++;
               
//             }
//         }
//               for(int i=0;i<nums.length;i++){
//             if(nums[i]==pivot){
//                nums1 = new int[temp];
//                 nums1[temp-1] = nums[i];
//                 System.out.println(nums1[temp-1]);
//                 //temp++;
               
            
//         }
        
//     }
//      for(int i=0;i<nums.length;i++){
//             if(nums[i]>pivot){
//                nums1 = new int[temp];
//                 nums1[temp-1] = nums[i];
//                 //System.out.println(nums1[temp-1]);
//                 temp++;
               
            
//         }
        
//     }
//     return temp;

    
// }
//     public static void main(String[] args) {
//         int[] nums = {9,12,5,10,14,3,10};
//         int pivot = 10;
//         Solution res = new Solution();
//         System.out.println(res.pivotArray(nums,pivot));

//     }

// }