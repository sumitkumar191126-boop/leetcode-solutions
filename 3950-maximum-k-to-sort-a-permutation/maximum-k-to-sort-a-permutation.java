class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length ;
        int k = -1; 
        for(int i = 0;i<n;i++){
       
               if(i != nums[i]){
                k = k & nums[i];
            }
        }
        if(k==-1){
            return 0;
        }

        else return k;
    }  
}