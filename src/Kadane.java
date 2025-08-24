import java.util.Arrays;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {4,-1,2,-7,3,4};
        System.out.println("Largest sum of a sub-array is : "+ kadane(arr));
    }

    private static int kadane(int[] arr) {
        int max = arr[0];
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr = Math.max(curr,0);
            curr += arr[i];
            max = Math.max(curr,max);
        }
        return max;
    }
}
