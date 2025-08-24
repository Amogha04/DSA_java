public class BS_without_arr_length {
    public static void main(String[] args) {
        int[] arr = {12,34,45,46,48,50,67,78,89};
        System.out.println(ans(arr,67));
    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        //Since we cannot use arr.length we first search for our target
        //element in 0 and 1 indices.If not found double the search space and search
        while (target > arr[end]){
            int newS = end + 1;
            end = end + (end - start + 1) * 2;
            start = newS;
            //Have to use arr.length as it will throw exception later if index of end is
            //greater than length of the array
            if(end > arr.length){
                end = arr.length - 1;
            }
        }
        return binary_search(arr,target,start,end);
    }
    static int binary_search(int[] arr,int target,int start,int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else start = mid + 1;
        }
        return -1;
    }
}