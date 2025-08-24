import java.util.Arrays;

public class Bubble_sort {
    //Stable and unstable sorting algorithms
// Stable - The order before and after sorting is maintained
// Unstable - Ulta
    public static void main(String[] args) {
        //Also known as sinking sort / exchange sort
        int[] arr = {12,34,1,56,6,7,13,90,100,23};
//        bubblesort(arr);
//        System.out.println(Arrays.toString(arr));
        bubble_rec(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //for number of passes,passes = length - 1
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                //for swapping greater element with previous smaller element
                //at end of each pass max element of the array comes to its correct position
                if(arr[j + 1] < arr[j]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                }
            if(!swapped){
                break;
            }
            //TIME : O(N * N)
            //SPACE : O(1)
        }
    }
    static void bubble_rec(int[] arr,int n,int i){
        if(n == 0){
            return;
        } if(i < n ) {
            if(arr[i] > arr[i + 1]){
                int temp;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            bubble_rec(arr,n,i + 1);
        }else {
            bubble_rec(arr,n - 1,0);
        }
    }
}