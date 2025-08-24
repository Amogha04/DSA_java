public class Max_2D_sum {
    public static void main(String[] args) {
    int[][] arr = {{1,5},
            {7,3},
            {3,5}};
        System.out.println("Max wealth🤑:" + max_wealth(arr));
    }
    static int max_ele(int[] arr){
        int i;
        int max = arr[0];
        for (i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int sum_arr(int[] arr){
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    static int max_wealth(int[][] arr){
        int[] sum = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            sum[i] = sum_arr(arr[i]);
        }
        return max_ele(sum);
    }
}
