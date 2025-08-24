public class rotated_BS_rec {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(recursive_BS(arr,1,0,arr.length - 1));
    }

    private static int recursive_BS(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target < arr[mid] && target >= arr[start]){
                return recursive_BS(arr,target,start,mid - 1);
            }else return recursive_BS(arr,target,mid + 1,end);
        }
        if(target > arr[mid] && target <= arr[end]){
            return recursive_BS(arr,target,mid + 1,end);
        }
        return recursive_BS(arr,target,start,mid - 1);
    }
}
