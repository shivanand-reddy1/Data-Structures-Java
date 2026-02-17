import java.util.*;

public class editDistance {

    public static int minDist(String s1, int m, String s2, int n, int[][] dp) {
        if (m < 0) return n + 1;   // need to insert all remaining chars of s2
        if (n < 0) return m + 1;   // need to delete all remaining chars of s1

        if (dp[m][n] != -1) return dp[m][n];

        if (s1.charAt(m) == s2.charAt(n)) {
            return dp[m][n] = minDist(s1, m - 1, s2, n - 1, dp);
        } else {
            int delete = minDist(s1, m - 1, s2, n, dp);
            int insert = minDist(s1, m, s2, n - 1, dp);
            int replace = minDist(s1, m - 1, s2, n - 1, dp);

            return dp[m][n] = 1 + Math.min(delete, Math.min(insert, replace));
        }
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return minDist(word1, m - 1, word2, n - 1, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String word2 = sc.nextLine();

        int ans = minDistance(word1, word2);

        System.out.println("Minimum Edit Distance = " + ans);

        sc.close();
    }
}
