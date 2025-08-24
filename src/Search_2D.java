import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(Arrays.toString(search_binary(arr,1)));
    }
    static int[] search_binary(int[][] matrix , int target){
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            } else if (matrix[row][col] < target) {
                row ++;
            }else col --;
        }
        return new int[]{-1,-1};
    }
}
