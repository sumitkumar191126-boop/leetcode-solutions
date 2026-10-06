class Solution {
    public int missingNumber(int[] a) {
       /*int smallest =  a[0];
       int greatest = a[0];
       int h = a.length-1;
       int l=1;
       while(l<h){
        if(greatest<a[l]){
            greatest =a[l];
        }
        l++;
       }*/
       
       for(int num=0;num<=a.length;num++){
        int found=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                found=1;
                break;
            }
        } 
        if(found==0){return num;}

       } 
       return -1;
    }
}