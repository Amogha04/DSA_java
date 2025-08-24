public class Rotation_Count {
    public static void main(String[] args) {
        int[] arr = {20,34,49,56,15,19};
        System.out.println("Number of rotations : "+ rotation_count(arr));
    }
    static int rotation_count(int[] arr){
        //4 cases
        //1: if(mid > mid + 1) -> return mid
        //2: if(mid < mid - 1) -> return mid - 1
        //3: if(mid < start) -> end = mid - 1
        //4: if(mid > end) -> start = mid + 1
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }
            if(arr[mid] > arr[end]){
                start = mid + 1;
            }
        }
        return start;
    }
}