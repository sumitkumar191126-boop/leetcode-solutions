class Solution {
    public int longestConsecutive(int[] a) {
        if (a.length == 0) return 0;
        Arrays.sort(a);
        int count = 1;
        int max =1
            ;
        if(a.length==1){return 1 ;}
        for(int i = 1 ; i <a.length ; i++){
            if(a[i]==a[i-1]+1){
            count++;
            }
           else if (a[i]==a[i-1]){
                continue;
            }
            else {count = 1 ; }

            if(max<count){
                max=count;
            }
        }
        return max;
    }
}