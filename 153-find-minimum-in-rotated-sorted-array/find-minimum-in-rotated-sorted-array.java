class Solution {
    public int findMin(int[] nums) {
        int h = nums.length-1 ; 
        int min = 0 ;
        int l = 0 ;
        if(h==0){
            min = nums[h];
        }
        while(l<=h){
            int mid = (l+h)/2 ; 
        if(nums[mid]<=nums[h]){
          min=nums[mid];
          h=h-1;
        }
        else if(nums[mid]<min){
            h=mid-1;
        }
        else l=mid+1;
 }
        return min ; 
    }
}