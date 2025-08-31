package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {23,43,56,78,1,2,45,0,23,-2};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static int[] mergesort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first ,int[] second){
        int[] merged = new int[first.length + second.length];
         int i = 0;
         int j = 0;
         int k = 0;
        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
                k++;
            }else {
                merged[k] = second[j];
                j++;
                k++;
            }
        }
        while (i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }
    //TIME : O(N * log N)
    //SPACE : O(N)
}
