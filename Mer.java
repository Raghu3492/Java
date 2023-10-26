class Mer {
    
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float[] merArr=new float[nums1.length+nums2.length];
        int j=0;
        float med;
     for(int i=0;i<nums1.length+nums2.length;i++){
        if(i<nums1.length){
            
            merArr[i] = nums1[i];
        }
        else{
            
            if(j!=nums2.length){
                merArr[i]=nums2[j];
                j++;
            }
        }

     }
    //   for(int i=0;i<merArr.length;i++){
    //     System.out.println(merArr[i]);
    // }

      for(int i=0;i<merArr.length-1;i++){
        for(j=i+1;j<merArr.length;j++){
            if(merArr[i]>merArr[j]){
                float temp=merArr[i];
                merArr[i]=merArr[j];
                merArr[j]=temp;
            }
        }
        }    
    // for(int i=0;i<merArr.length;i++){
    //     System.out.println(merArr[i]);
    // }

    if(merArr.length%2!=0){
        int midIndex = 0+(merArr.length-1)/2;
         med=merArr[midIndex];

    }
    else{
        int midIndex = 0+(merArr.length-1)/2;
        med = ((merArr[midIndex])+(merArr[midIndex+1]))/2;
        
    }
    return med;
     
    }


public static void main(String[] args) {
    int[] nums1 = {1,9,8,6};
    int[] nums2 = {7,0,10,4};
    System.out.println(Mer.findMedianSortedArrays(nums1,nums2));
    //Mer.findMedianSortedArrays(nums1,nums2);
}
}
