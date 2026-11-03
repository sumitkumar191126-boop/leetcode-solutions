class Solution {
    public int minMoves(int[] nums) {
       int n  =  nums.length;
       Arrays.sort(nums);
       int max = nums[n-1];
       int sum = 0;
       for(int i = 0;i<n-1;i++){
        sum = sum + (max-nums[i]);
       }
       return sum;
    }
}