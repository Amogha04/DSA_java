import java.util.ArrayList;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(countRestrictions(board,0,0));
        System.out.println(pathRestrictions(board,"",0,0));
    }
    static int countRestrictions(boolean[][] maze,int r,int c){
        if(r == maze.length - 1 || c == maze[0].length - 1){
            return 1;
        }
        if(!maze[r][c]){
            return 0;
        }
        int left = countRestrictions(maze,r + 1,c);
        int right = countRestrictions(maze,r,c + 1);

        return left + right;
    }
    static ArrayList<String> pathRestrictions(boolean[][] maze,String p,int r,int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        ArrayList<String> result = new ArrayList<>();
        if(r + 1 < maze.length){
            result.addAll(pathRestrictions(maze,p + 'D',r + 1,c));
        }
        if(c + 1 < maze[0].length){
            result.addAll(pathRestrictions(maze,p + 'R',r ,c + 1));
        }
        return result;
    }
}
