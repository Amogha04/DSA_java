public class sorted_array_using_rec {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,12,34,56,89,100};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        return helper(arr,0);
    }

     static boolean helper(int[] arr, int i) {
           if(i == arr.length - 1){
               return true;
           }
           return arr[i] < arr[i + 1] && helper(arr,i + 1);
    }
}
