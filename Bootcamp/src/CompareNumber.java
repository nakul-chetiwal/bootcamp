/*
1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
*/

import java.util.Scanner; // import the Scanner class
import java.util.InputMismatchException;

public class CompareNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        float value1 = 0, value2 = 0;
        // Try catch is used to allow only numbers
        try {
            System.out.println("Enter first number");
            value1 = myObj.nextFloat();
            System.out.println("Enter second number");
            value2 = myObj.nextFloat();
            // checking conditions  // without creating function
            if (value1 == value2) {
                System.out.println("True");
            } else if (value1 < value2) {
                System.out.println("False");
            } else if (value1 <= value2) {
                System.out.println("True");
            } else if (value1 > value2) {
                System.out.println("False");
            } else if (value1 >= value2) {
                System.out.println("True");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Only Numbers is allowed");
        }
    }
}
