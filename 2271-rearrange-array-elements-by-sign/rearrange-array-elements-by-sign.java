class Solution {
    public int[] rearrangeArray(int[] nums) {
       int l = 0;
       int k = nums.length;
       int[] a = new int [k];
       
        /*for(int i = 0;i<nums.length;i++){
           while(l<k) {if(l==0){
                if(nums[i]>0){
                a[l]=nums[i];
            } l++;
             }

             else if  (a[l-1]>0){
                if(nums[i]<0){
                a[l]=nums[i]; l++;}
             }  

              else if  (a[l-1]<0){
                if(nums[i]>0){
                a[l]=nums[i]; l++;}
             }  
             
        } }*/



        int neg =1;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[pos]=nums[i];
                pos=pos+2;
            }
            else if (nums[i]<0){
                a[neg]=nums[i];
                neg=neg+2;
            }
        }
        return a ;
    }
}