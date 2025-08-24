public class N_Knights {
    public static void main(String[] args) {
        int knights = 4;
        boolean[][] board = new boolean[knights][knights];
        knight(board, 0, 0, knights);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            displayBoard(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        // Try placing knight if safe
        if (is_safe(board, row, col)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false; // backtrack
        }

        // Skip placing knight at (row, col)
        knight(board, row, col + 1, knights);
    }

    private static boolean is_safe(boolean[][] board, int row, int col) {
        if(isValid(board,row - 2,col - 1)){
            if (board[row - 2][col - 1]){
                return false;
            }
        }
        if(isValid(board,row - 2,col + 1)){
            if (board[row - 2][col + 1]){
                return false;
            }
        }
        if(isValid(board,row - 1,col + 2)){
            if (board[row - 1][col + 2]){
                return false;
            }
        }
        if(isValid(board,row - 1,col - 2)){
            if (board[row - 1][col - 2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board,int row,int col){
        if(row >=0 && row < board.length && col >=0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void displayBoard(boolean[][] board) {
        for(boolean[] row : board){
            for (boolean element : row){
                if(element){
                    System.out.print("K ");
                }else System.out.print("_ ");
            }
            System.out.println();
        }
    }
}