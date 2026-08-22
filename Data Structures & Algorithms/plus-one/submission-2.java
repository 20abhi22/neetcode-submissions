class Solution {
    public int[] plusOne(int[] digits) {
        // int add=1;

        // for(int i=digits.length-1;i>0;i--){
        //     if(add!=0){
        //     if(digits[i]==9){
        //         digits[i]=0;
        //         continue ;
        //     }
        //     digits[i] +=add;
        //     add--;
        //     }
        //      break;


        // }
        // if(add!=0&&digits[0]==9){
        //     int[] arr=new int[digits.length+1];
        //     Arrays.fill(arr,0);
        //     arr[0]=1;
        //     return arr;

        // }
        // if(add!=0){
        //     digits[0]+=add;
        // }

        //     return digits;
        

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }

            digits[i]=0;
        }
    
        int res[] =new int[digits.length+1];
        res[0]=1;
        return res;

        
    }
}
