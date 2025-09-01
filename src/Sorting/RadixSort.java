package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {32,1004,1272,158,0,2,71,6,3};
        System.out.println(Arrays.toString(arr));
        Radixsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int getDigit(int num,int i){
        return (num /(int)Math.pow(10,i)) % 10;
    }

    private static void Radixsort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int MaxDigit = 0;
        while (max > 0){
            max /= 10;
            MaxDigit = MaxDigit + 1;
        }
        for (int i = 0; i < MaxDigit; i++) {
            ArrayList<Integer>[] buckets = new ArrayList[10];
            for (int b = 0;b < 10;b++){
                buckets[b] = new ArrayList<>();
            }
            for(int num : arr){
                int d = getDigit(num,i);
                buckets[d].add(num);
            }
            int idx = 0;
            for (int b = 0;b < 10;b++){
                for(int num : buckets[b]){
                    arr[idx++] = num;
                }
            }
        }
    }

}
