class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
         int k =0;int m = 0;
         String sumit =  "";
        create(n,m,k,sumit,str); 
           return str ;
    }
    public void create(int n , int m ,int k ,String sumit , List<String> str){
        String open = "(";
        String close =")";
        
        if(sumit.length()==2*n){
            str.add(sumit);
            return ;
        }

        if(m<n){
            create(n,m+1,k,sumit+"(",str);
        }

        if(k<m){
            create(n,m,k+1,sumit+")",str);
        }
     
    }
}