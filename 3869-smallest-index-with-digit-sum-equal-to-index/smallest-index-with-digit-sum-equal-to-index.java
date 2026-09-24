class Solution {
    public int smallestIndex(int[] a) {
      int k = 0;
        for(int i =0;i < a.length;i++){
              int m = 0;
         int n = a[i];
         while(n!=0){
            k=n%10;
            m = m +k;
            n=n/10;
         }
         if(m == i ){
            return i ;
         }
        }
        return -1;
        
    }
}