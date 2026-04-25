package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine Zahl zwischen  1 und 10 ein: ");
        int zahl1 = sc.nextInt();

        System.out.println("Gib eine Zahl zwischen 100 und 500 ein: ");
        int zahl2 = sc.nextInt();

        // Sum
        int sum = 0;
        int count = 0;

        for (int i = zahl1; i <= zahl2 ; i++) {
            sum += i;
            count++;
        }
        System.out.println("Summe: " + sum);


        // Average
        System.out.println("Average: " + zahl2 / zahl1);


    }
}
