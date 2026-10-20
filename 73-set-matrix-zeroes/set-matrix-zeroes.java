class Solution {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
     /*  int k = 1;
       int q = 1;
       boolean[] row = new boolean[m];   
       boolean[] col = new boolean[n];      
       int[][] change = new int[m][n];   */

     /*  for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
           change[i][j]=matrix[i][j];
            }
        }*/
                  boolean firstrow = false ; 
                  boolean firstcol = false ;
                  
                  for(int j = 0;j<n;j++){
                    if(matrix[0][j]==0){
                        firstrow=true;
                    }
                  }

                   for(int i = 0;i<m;i++){
                    if(matrix[i][0]==0){
                        firstcol=true;
                    }
                  }


            for(int i =1;i<m;i++){
            for(int j =1 ;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
          }

         for(int i  =1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0 ){

                    matrix[i][j] =0; 
                /*   row[i] = true;
                   col[j]=true;  */


             /*   for(int z =0;z<m;z++){
                for(int x=0;x<n;x++){
                    if(z==k){
                        matrix[z][x]=0;
                    }
                    else if(x==q){
                        matrix[z][x]=0;
                    }
                }
            } */


                }
            }
         }


       
    /*   for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            if(row[i] || col[j]){
                matrix [i][j]=0;
            }
        } 
        }    */

      if(firstrow){
        for(int j=0;j<n;j++){
         matrix[0][j]=0; }
      } 
       
        if(firstcol){
             for(int i=0;i<m;i++){
         matrix[i][0]=0;}
      }
       
        

       for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            System.out.println(matrix[i][j]);
            }
        }
    
    }
}