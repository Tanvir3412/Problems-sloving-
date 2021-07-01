package problemSloving;

public class MinMaxSum {

    public static void main(String[] args) {
       // MinMaxSum  x = new MinMaxSum();
        int [] x = {-1,0,1,4,5,7,8,10,20,40};
        System.out.println(sum1(x));
    }

    public static String sum1 (int x []) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            min += x[i];
        }
        int k = 0;
        for (  int j = x.length-1; k < 4; j-- ){
            max += x[j];
            k++;
        }


        return min + " " + max;
    }
    public static void sum (int x []) {

        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for (int i = 0; i < x.length; i++){
            if (x[i] != x[0]) {

                sum = sum + x[i]; // 2+3
            } if (x[i] != x[1]) {
                sum1 = sum1 + x[i]; // 1+
                System.out.println(sum1);
            } if (x[i] != x[2]) {
                System.out.println(sum1);
                sum2 = sum2 + x[i]; // 1+2
            } if (x[i] != x[3]) {
                sum3 = sum3 + x[i]; // 1+2
            } if (x[i] != x[4]) {
                sum4 = sum4 + x[i];
            }
        }
        int[] array = new int[]{sum, sum1, sum2, sum3, sum4};
        int min = array[0];
        int max = array[0];
        for(int j = 0; j < array.length; j++) {
            if (array[j] < min ) min = array[j];
            if (array[j] > max) max = array[j];
            System.out.println(min);
            System.out.println(max);
        }
        }

//    public static void sum1 (int array []) {
//        int[] array = new int[];
//
//        int min = array[0];
//        int max = array[0];
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] < min ) min = array[j];
//            if (array[j] > max) max = array[j];
//        }
//        System.out.println(min);
//        System.out.println(max);
//    }
}
