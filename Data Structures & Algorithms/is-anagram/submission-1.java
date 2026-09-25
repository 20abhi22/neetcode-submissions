class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int[] dp = new int[26];

        for(int i = 0;i<s.length();i++){
            char th= s.charAt(i);
            dp[th -'a']++;
        }

        for(int i = 0;i<t.length();i++){
            char th=t.charAt(i);
            dp[th -'a']--;
        }
        int sum=0;
        for(int k=0;k<26;k++){
            if(dp[k]!=0) return false;
        }

        return true;
        // else return false;
    }
}
