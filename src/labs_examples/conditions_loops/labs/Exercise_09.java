package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int zahl = 1;
        int zahl2 = 10;

        while (zahl2 > zahl) {
            System.out.println("Zahl: " + zahl);
            zahl++;
            zahl2--;
            if (zahl2 == zahl) {
                break;
            }

        }

    }
}
