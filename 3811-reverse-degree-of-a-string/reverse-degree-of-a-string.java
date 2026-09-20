class Solution {
    public int reverseDegree(String s) {
        int p = 0 ;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
              p = ( ('z'-ch+1)*(i+1) ) +p;
            }
        }
        return p ;
    }
}