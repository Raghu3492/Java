class Rearrange {
    public static int[] solution(int[] nums) {
        int[] arr = new int[nums.length];
        int[] temp = new int[nums.length/2];
        int[] temp1 = new int[nums.length/2];
        int j=0;
        int i=0;
        for(int num:nums){
        if(num>0){
            temp[i++] = num;
        }
        else{
            temp1[j++] = num;
        }
        }
        int k=0;
        for(int l=0;l<nums.length;l+=2){
            arr[l] = temp[k];
            arr[l+1] = temp1[k];
            k++;
        }

        return arr;
        
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};

        //Rearrange r = new Rearrange();
        
        System.out.println(Rearrange.solution(nums));
    }
}