package BackTracking;

public class fourDirectionMazePathWiithObsticalsWithNoExtraSpace5 {
    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] maze = {{1, 0, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}};

        printAllPaths(0, 0, m, n, "", maze);

    }
    private static void printAllPaths(int i, int j, int m, int n, String s,int[][] maze) {
        if(i < 0 || j < 0) return;
        if(i > m-1 || j > n-1) return;
        if(maze[i][j] == 0) return;

        if(maze[i][j] == -1) return;


        if(i == m-1 && j == n-1){
            System.out.print(s);
            System.out.println();
            return;
        }

        maze[i][j] = -1;

        printAllPaths(i+1, j, m, n, s+"D", maze);
        printAllPaths(i, j+1, m, n, s+"R", maze);
        printAllPaths(i-1, j, m, n, s+"U", maze);
        printAllPaths(i, j-1, m, n, s+"L", maze);

        maze[i][j] = 1;

    }
}



