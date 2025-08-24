import java.util.Arrays;

public class selection_rec {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,1,9};
        selection_reccursion(arr,arr.length - 1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_reccursion(int[] arr,int n,int i,int max){
        if(n == 0){
            return;
        }
        if(i < n){
            if(arr[i] > arr[max]){
                selection_reccursion(arr,n,i + 1,i);
            }else selection_reccursion(arr,n,i + 1,max);
        }else {
            int temp = arr[max];
            arr[max] = arr[n - 1];
            arr[n - 1] = temp;
            selection_reccursion(arr,n - 1,0,0);
        }
    }
}
