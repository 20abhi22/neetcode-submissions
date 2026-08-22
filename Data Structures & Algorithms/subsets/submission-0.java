class Solution {

    public void backtrack(int[] nums, int index, List<Integer> curr,List<List<Integer>> res){
        res.add(new ArrayList(curr));
        for(int i=index; i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,res);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // for (List<Integer> adj: res) res.add(new ArrayList());
        List<Integer> curr =new ArrayList<>();
        backtrack(nums,0,curr,res);
        return res;


    }
}
