import java.util.Arrays;

public class Cyclic_sort{
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6};
        System.out.println(Arrays.toString(arr));
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if(arr[i] == i + 1) {
                i++;
            }else {
                int temp;
                int correct = arr[i] - 1;
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
    }
}