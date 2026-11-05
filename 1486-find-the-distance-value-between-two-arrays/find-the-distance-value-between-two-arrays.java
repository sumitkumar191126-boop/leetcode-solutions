class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length ;
        int m = arr2.length ;
        int count = 0 ;
        
        for(int i = 0 ; i<n ;i++ ){
            int temp = arr1[i];
            int check = 0 ;
            for(int j = 0 ;j<m ;j++){
                if(temp<arr2[j]){
                if(-1*(temp - arr2[j])  <= d)    
                {check = 1 ;
                break ;} }
                else  if((temp - arr2[j] )  <= d)    
                {check = 1 ;
                break ;}
            }
            if(check==0){count++;}
        }
        return count ;
    }
}