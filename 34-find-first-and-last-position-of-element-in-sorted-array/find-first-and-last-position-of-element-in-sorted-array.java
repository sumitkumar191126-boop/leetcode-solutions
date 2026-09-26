class Solution {
     public int[] searchRange(int[] a, int k){
        int l=0;
        int h = a.length-1;
        int first = -1;
        int last = -1;
        while(l<=h){
            int m = (l+h)/2;
            if(a[m]==k){
                first  = m;
                h = m-1;
            }
            else if (a[m]<k){
                l=m+1;
            }
            else h = m-1;
        }

        l = 0;
        h=a.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(a[m]==k){
                last = m;
                l= m+1;
            }
            else if(a[m]<k){
               l=m+1;
            }
            else h=m-1;
        }
       
             return new int[]{first,last};
           
    }  
   
}