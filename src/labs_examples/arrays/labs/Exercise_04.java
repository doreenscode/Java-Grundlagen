package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int [][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] outer : arr) {
            for (int[] inner : arr) {
                for (int anInner : inner) {
                    System.out.print(anInner + " ");
                }
            }
        }
    }

}
