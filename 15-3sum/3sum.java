class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> copy = new ArrayList<>();
        Set<List<Integer>> unique = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            Set<Integer> seen = new HashSet<>();
           for(int j = i+1;j<n;j++){
               int third = -(nums[i]+nums[j]);
               if(seen.contains(third)){
                List<Integer> ans = new ArrayList<>();
                ans.add(nums[i]);
                 ans.add(nums[j]);
                  ans.add(third);
               Collections.sort(ans);
               unique.add(ans);   }

               seen.add(nums[j]);     
        }
     } 
     copy.addAll(unique);
     return copy;   
    }
}
