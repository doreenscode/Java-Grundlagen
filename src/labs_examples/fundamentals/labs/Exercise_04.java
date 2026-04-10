package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        byte aByte = 127;
        System.out.println("byte is: " + aByte);
        short aShort = 32767;
        System.out.println("short is: " + aShort);
        char aChar = 'a';
        System.out.println("char is: " + aChar);
        boolean aBoolean = true;
        System.out.println("boolean is: " + aBoolean);
        long aLong = 2146515479865167465L;
        System.out.println("long is: " + aLong);
        double aDouble = 1.23456789;
        System.out.println("double is: " + aDouble);
        float aFloat = 1.23456789f;
        System.out.println("float is: " + aFloat);

    }

}
