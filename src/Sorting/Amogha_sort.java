package Sorting;

import java.util.Arrays;

public class Amogha_sort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,0,6,5};
        System.out.println(Arrays.toString(amogha_sort(arr)));
    }

    static int[] amogha_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // for number of passes
            for (int j = i + 1; j < arr.length; j++) {
                // for swapping
                if (arr[j] < arr[i]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
