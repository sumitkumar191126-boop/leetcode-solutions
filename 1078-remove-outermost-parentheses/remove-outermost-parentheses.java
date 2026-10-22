class Solution {
    public String removeOuterParentheses(String s) {
        int depth =0;
        int n = s.length();
        if(n==0){return s;}
        char open ='(';
        char close = ')';
       StringBuilder hupp = new StringBuilder() ; 
        for (int i =0;i<n;i++){
           char c = s.charAt(i);

            if(c==open){
                if(depth>0){ hupp.append(open);}
            depth++;
            }
     
            if(c==close ){
            depth--;
            if(depth!=0){
          hupp.append(close);
            }} 
        }
      return hupp.toString();
    }
}