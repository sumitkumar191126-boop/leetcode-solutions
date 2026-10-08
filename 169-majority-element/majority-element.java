class Solution {
    public int majorityElement(int[] nums) {
        int i=0;
    while( i<nums.length){
         int count =0; 
         int l = i;
        for(int j=0;j<nums.length;j++){
          if(nums[i]==nums[j]){
            count++;
           l++;
          } 
        }
         
        if(count > nums.length/2 ){
            return nums[i];
        }
       i=l;
    }   
     return -1;      
    }
}