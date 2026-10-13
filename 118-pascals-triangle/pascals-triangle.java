class Solution {
    public List<List<Integer>> generate(int numRows) {
        int  row= numRows ;
        List<List<Integer>> ans  = new ArrayList<>() ;
        for(int  i = 1;i<=row;i++){
            List<Integer> rowList = new ArrayList<>();
            int value = 1;
            for(int j = 1 ; j<=i;j++){
                rowList.add(value);
                value  = value  * (i-j);
                value  = value / j;
                
            } 
            ans.add(rowList);
        }
         return ans;
    }
}