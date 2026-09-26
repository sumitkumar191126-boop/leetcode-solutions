/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* a, int n, int k, int* returnSize) {
    int l=0;
        int h = n-1;
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
        h=n-1;
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
       
           int* ans = malloc(2*sizeof(int));
           ans[0] = first;
           ans[1] = last;
           *returnSize = 2;
           return ans;
}