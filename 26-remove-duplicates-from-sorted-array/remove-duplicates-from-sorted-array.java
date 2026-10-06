class Solution {
    public int removeDuplicates(int[] a) {
        int unique=0 ;
       for( int i =1;i<a.length;i++){
        if(a[unique]!=a[i]){
            a[unique+1]=a[i];
            unique++;
        }
       }
       return unique+1; 
    }
}