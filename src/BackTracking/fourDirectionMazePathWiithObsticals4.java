package BackTracking;

public class fourDirectionMazePathWiithObsticals4 {
    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] maze = {{1, 0, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}};

        boolean[][] isVisited = new boolean[m][n];
        printAllPaths(0, 0, m, n, "", maze, isVisited);

    }

    private static void printAllPaths(int i, int j, int m, int n, String s,int[][] maze, boolean[][] isVisited) {
        if(i < 0 || j < 0) return;
        if(i > m-1 || j > n-1) return;
        if(maze[i][j] == 0) return;
        if(isVisited[i][j]) return;

        if(i == m-1 && j == n-1){
            System.out.print(s);
            System.out.println();
            return;
        }
        isVisited[i][j] = true;

        printAllPaths(i, j+1, m, n, s+"R", maze, isVisited);
        printAllPaths(i+1, j, m, n, s+"D", maze, isVisited);
        printAllPaths(i-1, j, m, n, s+"U", maze, isVisited);
        printAllPaths(i, j-1, m, n, s+"L", maze, isVisited);

        isVisited[i][j] = false;
    }

}


