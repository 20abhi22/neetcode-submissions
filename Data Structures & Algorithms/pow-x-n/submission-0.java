class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==1) return x;
        if(n<0){
            x=1/x;
            n=-n;
        }
    //    int rem; 
       double out=1.0;

        while(n>0){
            if(n%2==1) out*=x;
            n/=2;
            x*=x;
            

            
        }
        return out;
        
        
    }
}
