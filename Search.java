package binarySearch;

public class Search {

    public static void main(String[] args) {
        int[]  arr = {0,1,3,8,9,15};
        int target = 16;  //linear search
        boolean b = binarySearchTree(arr, target);
        System.out.println(b);

    }

    public static boolean binarySearchTree(int[] arr, int target) {
       if(arr.length == 0) return false;
       return binarySearchTreeHelper(arr, 0, arr.length-1, target);
    }

    private static boolean binarySearchTreeHelper(int[] arr, int start, int end, int target) {
        // base case
        if(start > end) return false;

        int midIndex = (end + start)  /2;

        if( target == arr[midIndex]) return  true;

        if(target > arr[midIndex]){
            return binarySearchTreeHelper(arr, midIndex + 1, end, target );
        }
        if(target < arr[midIndex]){
            return  binarySearchTreeHelper(arr, start, midIndex -1, target );
        }

        /// time complexity will be o( nlogn)
        return false;
    }
}
