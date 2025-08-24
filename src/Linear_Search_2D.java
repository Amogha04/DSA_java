import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < rows;i++){
            System.out.println("Enter the number of cols for each row number : "+i);
            int cols = in.nextInt();

            arr[i] = new int[cols];

            for (int j = 0;j < cols;j++){
                System.out.println("Enter the elements of "+ i  + "row and "+ j +"col");
                arr[i][j] = in.nextInt();
            }
        }
        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        };
        System.out.println("Enter the element to be searched: ");
        int find = in.nextInt();
        System.out.println("The is element is "+find_ele_in2D(arr,find));
    }
    static String find_ele_in2D(int[][] arr,int ele){
        for(int rows = 0;rows < arr.length;rows++){
            for (int cols = 0;cols <arr[rows].length;cols++){
                if(arr[rows][cols] == ele){
                    return "found";
                }
            }
        }
        return "not found";
    }
}
