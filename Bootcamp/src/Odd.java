/*
4) Ask user to input a whole number and output false, if it is even number and true if it is odd number
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Odd {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter Number: ");
            int a = scan.nextInt();
            System.out.println("result : " + OddEven(a));
        } catch (InputMismatchException e) {
            System.out.println("Please enter whole number");
        }
    }

    static boolean OddEven(int a) {
        if (a % 2 == 0)
            return false;
        else
            return true;

    }
}


