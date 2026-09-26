class Solution {

    private void backtrack(int[] nums,int start,List<Integer> current,List<List<Integer>> result){
        // if(current.size()==nums.length) ;
        result.add(new ArrayList<>(current));

        for(int i = start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            current.add(nums[i]);
            // used[i]=true;

            backtrack(nums,i+1,current,result);
            // used[current.size()-1]=false;
            current.remove(current.size()-1);

            
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>(),result);
        // result.add(new ArrayList<>());
        return result;
    }
}
