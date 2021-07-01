package problemSloving;

import java.util.Arrays;
import java.util.Scanner;

public class StairCase {
    //private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        int x = 3;
//       // int y = 0;
//
//        for (int i = 0; i < x; i++) {
//
//          //  System.out.print("#");
//
//            for (int j = 0; j < x; j++) {
//
//                  System.out.print("#");
//
//            }
//            System.out.println();
//        }
         stairCase(3);


    }

    public static void stairCase(int x){

        for (int i = x -1; i >= 0; i--){
            for (int j = 0; j < x; j++) {
                if (j <i ) {
                    System.out.print(" ");
                } else
                System.out.print("#");
            }
            System.out.println();

        }


    }

}
