public class twoDirectionMazePath {
    public static void main(String[] args) {
        int m = 4, n = 4;
        System.out.println("The number of paths is: " + printAllPaths(0, 0, m, n));
    }

    private static int printAllPaths(int i, int j, int m, int n) {
        if(i > m-1 || j > n-1) return 0;
        if(i == m-1 && j == n-1){
            return 1;
        }
        int rightPaths = printAllPaths(i, j+1, m, n);
        int downPaths = printAllPaths(i+1, j, m, n);
        return rightPaths + downPaths;
    }
}
