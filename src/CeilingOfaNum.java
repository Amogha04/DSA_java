public class CeilingOfaNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,89,100};
        System.out.println(binary_search(arr,10));
    }
    static int binary_search(int[] arr,int target){
        int lo = 0;
        int hi = arr.length - 1;
        if(target > arr[arr.length - 1]){
            return -1;
        }
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > target){
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            }
            else if (arr[mid] == target){
                return arr[mid];
            }
        }
        return arr[lo]; // for floor return arr[hi]
    }
}
