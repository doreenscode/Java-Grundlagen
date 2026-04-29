package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *  *      element.
 *  *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie eine Nummer zwischen 1-10 ein: ");
        int number = sc.nextInt();
        boolean isFound = false;


        for (int num : array) {
            // Use == for primitives
            if (num == number) {
                isFound = true;
                System.out.println(num - 1);
            }

        }


    }
}