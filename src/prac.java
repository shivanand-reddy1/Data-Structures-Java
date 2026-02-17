class Solution {
    public int lpm(String s1, int m, String s2, int n, int[][] dp){
        if(m < 0 || n < 0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        if(s1.charAt(m) == s2.charAt(n)){
            dp[m][n] = 1 + lpm(s1, m-1, s2, n-1, dp);
        }
        else {
            return dp[m][n] = Math.max(lpm(s1, m, s2, n-1, dp) , lpm(s1, m-1, s2, n, dp));
        }
        return dp[m][n];

    }
    public int longestPalindromeSubseq(String s) {
        String text1 = s;
        String text2 = new StringBuilder(s).reverse().toString();

        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }


        return lpm(text1, m-1, text2, n-1, dp);
    }
}