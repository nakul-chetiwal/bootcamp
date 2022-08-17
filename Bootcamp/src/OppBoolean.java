/*
5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class OppBoolean {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter Any Boolean Value: ");
            boolean bValue = scan.nextBoolean();
            System.out.println("The Opposite Value of " + bValue + ": " + reverseBoolean(bValue));
        } catch (InputMismatchException e) {
            System.out.println("Please Enter True or False");
        }
    }

    static boolean reverseBoolean(boolean bval) {
        return !bval;

    }
}