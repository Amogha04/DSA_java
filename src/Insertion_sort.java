import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {12,34,12,23,56,0,9,89,100};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            //for number of passes,after each pass left array gets sorted
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else break;//to avoid unnecessary checking as left array is already sorted
            }
            //TIME : O(N * N) -> WORST CASE
            //         O(N) -> BEST CASE
        }
    }
}