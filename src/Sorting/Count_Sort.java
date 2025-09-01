package Sorting;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Count_Sort {
    public static void main(String[] args) {
        int[] arr = {3,4,3,6,6,1,8,9};
        System.out.println(Arrays.toString(arr));
        CountSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CountSort(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : arr){
            int freq = map.getOrDefault(i,0);
            map.put(i,freq + 1);
        }
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                arr[index++] = key;
            }
        }
    }
}
