class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        int count = 1; 
        for(int j=1;j<nums.length;j++){
          if(count==0){
            count++;
            max=nums[j];
          }
          else if(max==nums[j]) {
            count++;
          }
          else count--;  
       
        }
      
     return max;
    }   
          
    }
