class Solution {

    private void backtrack(int[] nums,boolean[] used,ArrayList current,List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            current.add(nums[i]);
            used[i]=true;

            backtrack(nums,used,current,result);

            used[i]=false;
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums,used,new ArrayList<>(),result);
        return result;
    }
}
