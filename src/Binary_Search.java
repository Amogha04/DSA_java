public class Binary_Search {
    public static void main(String[] args) {
     int[] arr = {2,3,4,5,6,7,89,100};
        System.out.println(binary_search(arr,101));
        int [] arr2 = {13,12,11,9,5,4,1,0};
        System.out.println(order_agnostic_bs(arr2,13));
        System.out.println(order_agnostic_bs(arr,2));
    }
    static int binary_search(int[] arr,int target){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > target){
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            }
            else if (arr[mid] == target){
                return mid;
            }
        }
       return -1;
    }
    static int order_agnostic_bs(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        if(arr[0] < arr.length){
            int lo = 0;
            int hi = arr.length - 1;
            while (lo <= hi){
                int mid = lo + (hi - lo)/2;
                if(arr[mid] > target){
                    hi = mid - 1;
                } else if (arr[mid] < target) {
                    lo = mid + 1;
                }
                else if (arr[mid] == target){
                    return mid;
                }
            }
        }
        else {
            int lo = 0;
            int hi = arr.length - 1;
            while (lo <= hi){
                int mid = lo + (hi - lo)/2;
                if(arr[mid] < target){
                    hi = mid - 1;
                } else if (arr[mid] > target) {
                    lo = mid + 1;
                }
                else if (arr[mid] == target){
                    return mid;
                }
            }
        }
        return -1;
    }
}
