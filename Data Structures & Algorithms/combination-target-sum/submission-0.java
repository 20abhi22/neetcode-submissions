class Solution {
    HashSet<List<Integer>> set =new HashSet<>();
    private void getCombination(int[] nums,int idx,int target,List<List<Integer>> ans,List<Integer> combin){
       
         if(target==0) {
            if(!set.contains(combin)){set.add(new ArrayList<>(combin));ans.add(new ArrayList<>(combin));}
            return;}
        if(idx==nums.length||target<0) return;


        // if(set.contains())
        combin.add(nums[idx]);
        getCombination(nums,idx,target-nums[idx],ans,combin);
        getCombination(nums,idx+1,target-nums[idx],ans,combin);
        combin.removeLast();
        getCombination(nums,idx+1,target,ans,combin);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        int idx =0;
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        getCombination(nums,0,target,ans,combin);
        return ans;

    }
}
