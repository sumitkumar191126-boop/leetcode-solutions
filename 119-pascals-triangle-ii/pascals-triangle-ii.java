class Solution {
    public List<Integer> getRow(int rowIndex) {
      int row = rowIndex + 1 ;
      List<Integer> ans = new ArrayList<>();
      long value  = 1 ; 
      for(int  i = 1 ; i<=row;i++){
        ans.add((int)value);
        value = value * (row-i);
        value = value / i ;
      }   
      return ans;
    }
}