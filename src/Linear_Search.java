import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Your array is :");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the element to be searched :");
        int find = in.nextInt();
//        System.out.println("The element is present in index " + linear_search(arr, find));
//
//    }
//
//    //Linear Search
//    static int linear_search(int[] arr, int ele) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == ele) {
//                return i;
//
//        }
//    }
//        return -1;
        //Q:Search in range
        System.out.println("Enter the range :");
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(element_in_range(arr,find,start,end));
}
//Method for search in given range
    static boolean element_in_range(int[] arr,int ele,int i,int j){
        if(arr.length == 0){
            return false;
        }
        for(int k = i;k <= j ;k++){
            if(arr[k] == ele){
                return true;
            }
        }
        return false;
    }
}
