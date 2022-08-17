/*
3) Ask user to input a whole number and output true, if it is even number and false if it is odd number
   Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
*/

import java.util.Scanner;
import java.util.InputMismatchException;
public class Even {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Whole Number: ");
            int num = scan.nextInt();
            System.out.println("Is this Even Number? " + findOddEven(num));
        } catch (InputMismatchException e) {
            System.out.println("Please Enter whole number");
        }
    }
    static boolean findOddEven(Integer num) {
        if (num % 2 == 0)
            return true;
        return false;
    }
}
