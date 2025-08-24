import java.util.ArrayList;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(countAllPaths(maze,0,0));
        System.out.println(AllPaths(maze,"",0,0));
    }
    static int countAllPaths(boolean[][] maze, int r, int c) {
        // Base condition: out of bounds
        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length) {
            return 0;
        }

        // If it's a blocked cell or already visited
        if (!maze[r][c]) {
            return 0;
        }

        // If destination is reached
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            return 1;
        }

        // Mark cell as visited
        maze[r][c] = false;

        // Explore all four directions
        int left = countAllPaths(maze, r, c - 1);
        int right = countAllPaths(maze, r, c + 1);
        int up = countAllPaths(maze, r - 1, c);
        int down = countAllPaths(maze, r + 1, c);

        // Backtrack: unmark the cell
        maze[r][c] = true;

        return left + right + up + down;
    }

    static ArrayList<String> AllPaths(boolean[][] maze, String p, int r, int c) {
        ArrayList<String> result = new ArrayList<>();

        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || !maze[r][c]) {
            return result;
        }

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            result.add(p);
            return result;
        }

        maze[r][c] = false;

        result.addAll(AllPaths(maze, p + 'R', r, c + 1));
        result.addAll(AllPaths(maze, p + 'D', r + 1, c));
        result.addAll(AllPaths(maze, p + 'L', r, c - 1));
        result.addAll(AllPaths(maze, p + 'U', r - 1, c));

        maze[r][c] = true;

        return result;
    }
}
