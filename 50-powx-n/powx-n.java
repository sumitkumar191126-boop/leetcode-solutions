class Solution {
    public double myPow(double x, int n) {
        double k=1.0;
        long m=n;
        if(m<0){
            m=-1*m;
        }
        
        while(m>0){
            if(m%2==1){
         k=k*x;
         m=m-1;
        }
        else {x=x*x;
        m=m/2;
        }}
        if(n<0){
            k=1/k;
        }
        return k;
    }
}