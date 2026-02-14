import java.util.*;

class Solution {

    public int lcm(String s1, int m, String s2, int n, int[][] dp){
        if(m < 0 || n < 0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        if(s1.charAt(m) == s2.charAt(n)){
            dp[m][n] = 1 + lcm(s1, m-1, s2, n-1, dp);
        }
        else {
            dp[m][n] = Math.max(
                lcm(s1, m, s2, n-1, dp),
                lcm(s1, m-1, s2, n, dp)
            );
        }
        return dp[m][n];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }

        return lcm(text1, m-1, text2, n-1, dp);
    }

    // main method to test longestCommonSubsequence
    public static void main(String[] args) {
        Solution sol = new Solution();

        String text1 = "abcde";
        String text2 = "ace";

        int ans = sol.longestCommonSubsequence(text1, text2);
        System.out.println("Longest Common Subsequence length = " + ans);
    }
}
