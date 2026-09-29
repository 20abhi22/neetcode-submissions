
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        // FIXED: Added the size inside the brackets
        int[] pos = new int[128];
        Arrays.fill(pos, -1);
        
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char currlet = s.charAt(end);
            int currIdx = currlet; 

            if (pos[currIdx] >= start) {
                start = pos[currIdx] + 1;
            }
            
            pos[currIdx] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
