class Solution {
    public void sortColors(int[] nums) {
       /* Arrays.sort(nums); */
      int n = nums.length;
       int k ;
     for(int j=0 ;j<n-1;j++){
        for(int i =0;i<n-1 ;i++){
         
         if(nums[i]>nums[i+1]){
            int temp = nums[i] ;
            nums[i] =nums[i+1];
             nums[i+1]=temp; 
         } 
      }
     } 
        
    }
}