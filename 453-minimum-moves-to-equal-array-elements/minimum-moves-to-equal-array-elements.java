class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length; 
        int sum =0 ;
        int min = nums[0];


        for(int i = 1;i<n;i++){
           if(nums[i]<min){
            min = nums[i];
           }
        }

       Arrays.sort(nums);
         for(int i= 1 ;i<n;i++){
         sum = sum + (nums[i] - min) ;
          }
         return sum ;
    }
}