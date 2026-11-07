class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int n = nums.length;
        int mid;
        if(n==1){
            if(nums[0]==target){
                return true ; 
            }
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0;j<n-1-i;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j] ; 
                    nums[j] = temp;
                }
            }
        }
        int h = n-1 ;
        while(l<=h ){
            mid= (l+h)/2 ; 
            if(nums[mid] == target){
                return true  ; 
            }
            else if (nums[mid] >target){
                h = mid-1;
            }
            else l = mid + 1;
        }
    /*    while(l<=h){
            mid=(l+h)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[l]<= nums[mid]){
              if(nums[l]<=target && nums[mid]>target){
                h=mid-1;
              }
              else l=mid+1;
            }
            else
            {
                if(nums[h]>=target && nums[mid]<target){
                   l=mid+1; 
                }
                else h=mid-1;
            }
        } */
        return false; 
    }
}