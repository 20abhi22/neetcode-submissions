class Solution {
    private int sumofDigits(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum += (digit*digit);
            n /=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow =n;
        int fast =n;

        do{
            slow = sumofDigits(slow);
            fast=sumofDigits(sumofDigits(fast));
        }while(slow != fast);

        return slow ==1;
    }
}
