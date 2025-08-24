import java.util.ArrayList;

public class Linear_Search_w_Rec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(linear_search_using_recursion(arr,0,target));
        System.out.println(linear_search_using_recursion_all_elements(arr,0,target,list));
    }

    private static ArrayList<Integer> linear_search_using_recursion_all_elements(int[] arr, int i, int target, ArrayList<Integer> list) {
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return linear_search_using_recursion_all_elements(arr,i + 1,target,list);
    }

    private static int linear_search_using_recursion(int[] arr, int i, int target) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return linear_search_using_recursion(arr,i + 1,target);
    }

}
