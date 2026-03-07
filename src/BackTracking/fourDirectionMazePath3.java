package BackTracking;

public class fourDirectionMazePath3 {
      private static void printAllPaths(int i, int j, int m, int n, String s, boolean[][] isVisited) {
          if(i < 0 || j < 0) return;
          if(i > m-1 || j > n-1) return;
          if(isVisited[i][j]) return;
          if(i == m-1 && j == n-1){
            System.out.print(s);
            System.out.println();
            return;
          }
          isVisited[i][j] = true;
          printAllPaths(i, j+1, m, n, s+"R", isVisited);
          printAllPaths(i+1, j, m, n, s+"D", isVisited);
          printAllPaths(i-1, j, m, n, s+"L", isVisited);
          printAllPaths(i, j-1, m, n, s+"U", isVisited);

          isVisited[i][j] = false;
    }

   public static void main(String[] args) {
        int m = 3, n = 3     ;

        boolean[][] isVisited = new boolean[m][n];

        printAllPaths(0, 0, m, n, "", isVisited);
  
   }
}

