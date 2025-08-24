import java.util.Arrays;

public class Binary_Search_2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(Arrays.toString(search_binary_2d(arr,11)));
    }
    static int[] search_binary_2d(int[][] matrix , int target){
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;

            while (start <= end){
                int mid = start + (end - start)/2;
                if(matrix[i][mid] == target){
                    return new int[]{i,mid};
                } else if (matrix[i][mid] > target) {
                    end = mid - 1;
                }else start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
