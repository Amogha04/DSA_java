package Sorting;

import java.util.*;

public class Radix_Sort_my_version {
    public static void main(String[] args) {
        int[] arr = {233,788,1,2,0,45,32,7};
        System.out.println(Arrays.toString(arr));
        RadixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
        private static int digit(int num, int i) {
            return (num / (int)Math.pow(10, i)) % 10;
        }

    private static void RadixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int MaxDigit = 0;
        while (max > 0){
            max /= 10;
            MaxDigit = MaxDigit + 1;
        }
        for (int i = 0; i < MaxDigit; i++) {
            TreeMap<Integer, List<Integer>> map = new TreeMap<>();
            for(int num : arr){
                int lastDigit = digit(num,i);
                map.computeIfAbsent(lastDigit,k ->new ArrayList<>()).add(num);
            }
            int idx = 0;
            for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
                for (int j : entry.getValue()){
                    arr[idx++] = j;
                }
            }
        }
    }
}
