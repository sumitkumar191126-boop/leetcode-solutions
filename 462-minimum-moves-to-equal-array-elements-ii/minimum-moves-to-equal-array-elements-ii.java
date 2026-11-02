class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int sum =0;
        Arrays.sort(nums);
        int mid = nums[n/2] ;
        for(int i =0;i<n;i++){
            int temp = nums[i];
            if(temp<mid){
                sum = sum+(mid-temp);
            }
            else  sum = sum+(temp-mid);
        }
        return sum ;
    }
}