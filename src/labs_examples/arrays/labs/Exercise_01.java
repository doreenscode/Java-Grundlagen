package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] number = new int [10];
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println("Geben Sie eine Zahl ein: ");
            number[i] = sc.nextInt();
            sum += number[i];
        }
        System.out.println(sum);


    }

}