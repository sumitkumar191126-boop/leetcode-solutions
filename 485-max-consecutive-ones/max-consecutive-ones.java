class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
     int max = 0;
     int count = 0;
     int n = a.length;
     for(int i =0;i<n;i++){
        if(a[i]==0){
            max= Math.max(max,count);
            count=0;
        }
        else count++;
     } 
      return Math.max(max,count);
    }
}