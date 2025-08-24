public class Even_number_of_digits {
    public static void main(String[] args) {
        int[] arr = {12,3,4,123,1234,55,7899,764};
        System.out.println("Number of even number of digits in the given array is :" + even_digts(arr));
    }

    static int even_digts(int[] arr){
        int count = 0;
        for (int i = 0;i < arr.length;i++){
            int count_digit = 0;
            if(arr[i] == 0){
                count_digit = 1;
            }
            if(arr[i] < 0){
                arr[i] = Math.abs(arr[i]);
            }
            while (arr[i] > 0){
                arr[i] = arr[i] / 10;
                count_digit++;
            }
            if(count_digit % 2 == 0){
                count ++;
            }
        }

        return count;
    }
}