class Solution {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
       int k = 1;
       int q = 1;
       int[][] change = new int[m][n];

       for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
           change[i][j]=matrix[i][j];
            }
        }

         for(int i  =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(change[i][j]==0){
                    k=i;
                    q=j;


                for(int z =0;z<m;z++){
                for(int x=0;x<n;x++){
                    if(z==k){
                        matrix[z][x]=0;
                    }
                    else if(x==q){
                        matrix[z][x]=0;
                    }
                }
            }


                }
            }
         }

       for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            System.out.println(matrix[i][j]);
            }
        }
    
    }
}