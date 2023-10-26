class Sum {
    public int[] twoSum(int[] nums, int target) {
        //int[] arr = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
           
        }
        return new int[]{};
         
        
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Sum myObj = new Sum();
        myObj.twoSum(nums,target);
        for(int ar:nums){
            System.out.println(ar);
        }
    }
}