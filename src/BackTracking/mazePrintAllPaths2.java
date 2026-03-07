package BackTracking;

public class mazePrintAllPaths2 {
    public static void main(String[] args) {
        int m = 2, n = 2;
        printAllPaths(0, 0, m, n, "");
    }

    private static void printAllPaths(int i, int j, int m, int n, String s) {
        if(i > m-1 || j > n-1) return;
        if(i == m-1 && j == n-1){
            System.out.println(s);
            return;
        }
        printAllPaths(i, j+1, m, n, s+'R');
        printAllPaths(i+1, j, m, n, s+'D');

    }
}
