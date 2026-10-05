class Solution {
    public void moveZeroes(int[] a) {
        int temp,j=0;
        for(int i =0;i<a.length;i++){
            if(a[i]!=0){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                j++;
            }
        }
    }
}