import java.util.Arrays;
import java.util.Scanner;

public class Array_practice{
    public static void main(String[] args) {
//        //One d-arrays
//        int[] arr1 = new int[4];
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("Enter the element of " + i + "th index :");
//            arr1[i] = in.nextInt();
//        }
//        System.out.println("The elements of array are: ");
//        System.out.println(Arrays.toString(arr1));
//        //Two d-arrays
//        int[][] arr2 = new int[3][3];
//        for (int row = 0; row < arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.println("Enter the element of " + row + "th " + col + "th index :");
//                arr2[row][col] = in.nextInt();
//            }
//        }
//        System.out.println("The elements of array are: ");
//        for (int[] ele : arr2) {
//            System.out.println(Arrays.toString(ele));
//        }
//    //Find the maximum element in the array
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of the array : ");
//        int size = in.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of the array : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println("Your array is :");
//        System.out.println(Arrays.toString(arr));
//        int max = arr[0];
//        for (int i = 0;i < arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Maximum element of the array is : "+ max);
        // Reverse the array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Your array is :");
        System.out.println(Arrays.toString(arr));

        int[] reversed = new int[size];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Reversed array is :");
        System.out.println(Arrays.toString(reversed));

    }
}