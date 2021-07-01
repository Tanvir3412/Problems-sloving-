package problemSloving;

import java.util.Arrays;

public class diagonalDifference {

    public static void main(String args[]) {

        int n = 3;

        int[][] digonalDiff = {
                {5,5,3,4,5},
                {5,4,0,3,5},
                {5,9,1,5,7},
                {3,6,1,2,5},
                {2,8,4,9,1}


        };

        int[] arr1 = {1,2,3,4};

//        System.out.println(Arrays.toString(reverse(arr1)));

        int i = diagoCheck(digonalDiff);
        System.out.println(i);


    }

    public static int diagoCheck(int[][] arr){
        int sum1 = 0;
        int sum2 = 0;
        int j = arr.length -1;

        for(int i = 0; i < arr.length; i++){
          sum1 = sum1 +   arr[i][i];
          sum2 = sum2 + arr[i][j--];
        }
        return Math.abs(sum1 - sum2);
    }

//    public static int [] reverse (int arr []) {
//
//        int [] result = new int[arr.length];
//
//        int j = arr.length;
//
//        for (int i = 0; i < arr.length; i++) {
//
//
//
//            result [i] = arr[j-i-1];
//            j++;
//
//
//        }
//        return result;
//    }


//    public static int [] reverse (int arr []) {
//
//        int [] result = new int[arr.length];
//
//        int j = 0;
//
//        for (int i = arr.length-1; i >= 0; i--) {
//
//
//
//            result [j] = arr[i];
//            j++;
//
//
//        }
//        return result;
//    }
//

//
//    public static int  diagonal(int[][] arr) {
//        int sum1 = 0;
//        int sum2 = 0;
//        int len = arr.length;
//
//
//        for (int i = 0; i < arr.length; i++){
//
//
//
//            sum1 += arr[i][i];
//
//            sum2 += arr[i][len-i-1];
//
//
//        }
//
//
//
//        return Math.abs(sum1 - sum2);
//    }


    }
