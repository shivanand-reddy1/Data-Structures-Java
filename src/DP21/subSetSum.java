import java.util.*;

class subSetSum {

    public static int helper(int i, int[] arr, int sum, int[][] dp) {
        if (sum < 0) return 0;

        if (i == arr.length) {
            return (sum == 0) ? 1 : 0;
        }

        if (dp[i][sum] != -1) return dp[i][sum];

        int take = helper(i + 1, arr, sum - arr[i], dp);
        int skip = helper(i + 1, arr, sum, dp);

        return dp[i][sum] = (take == 1 || skip == 1) ? 1 : 0;
    }

    static Boolean isSubsetSum(int arr[], int sum) {
        int[][] dp = new int[arr.length + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = helper(0, arr, sum, dp);
        return ans == 1;
    }

    // 🔽 Main method added
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        // Call function
        Boolean result = isSubsetSum(arr, sum);

        // Output
        System.out.println("Subset with given sum exists? " + result);

        sc.close();
    }
}
