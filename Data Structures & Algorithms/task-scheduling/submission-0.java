class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] char_map=new int[26];
        for(int c:tasks){
            char_map[c - 'A']++;
        }    
        Arrays.sort(char_map);

        int max=char_map[25]-1;
        int idle=max*n;

        for(int i=24;i>=0;i--){
            idle -=Math.min(char_map[i],max);
        }

        return idle > 0 ? idle+tasks.length :tasks.length ;
        
        }
}
