class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        int count =1;
        int maxC=1;
        Arrays.sort(nums);
        for(int i=1 ; i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue ;
            if(nums[i]-nums[i-1]==1){
                // if(i==1) count=1;
                count++;
            }
            else count =1;
                maxC=Math.max(count,maxC);

        }
        return maxC;
    }
}
