class Solution {
    public int reverseBits(int n) {
        int ne=0;
        // n/=2;
        for (int i=0;i<32;i++){
            ne<<=1;
           ne |= (n&1);
           n>>>=1;
            
        }
        return ne;

    }
}
