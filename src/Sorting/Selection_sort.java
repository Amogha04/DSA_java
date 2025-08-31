package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {12,34,56,78,90,1,2,3,67,100,45,23};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int max(int[] arr, int n){
        int max = 0;
        for (int i = 0; i <= n; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //for number of passes, after each pass max element will be in its correct position
                int last = arr.length - i - 1;
                int max_ele = max(arr, last);
                int temp;
                temp = arr[max_ele];
                arr[max_ele] = arr[last];
                arr[last] = temp;
            }
        //TIME : O(N * N)
        //SPACE : O(1)
        //STABLE : NO
        }
    }
