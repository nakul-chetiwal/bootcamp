

/*
6) Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
        1) a and b is equal
        2) a is less than 0 and b is greater than 0
        3) both of them are greater than 100
        otherwise output "false":
        Examples:
        a is -1 and b is -2 -> false
        a is -2 and b is 1 -> true
        a is -1 and b is -1 -> true
        a is 101 and b is 102 -> true
        a is 99 and b is 200 -> false

 */
import java.util.Scanner;
import java.util.InputMismatchException;
class compareNumbers {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Please First Number: ");
            int a = scan.nextInt();
            System.out.println("Please Second Number: ");
            int b = scan.nextInt();
            System.out.println("result : "+compare(a,b));
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter Valid Number");
        }
    }
    static boolean compare(int a,int b)
    {
        if(a==b)
            return true;
        else if(a < 0 && b > 0)
            return true;
        else if(a > 100 && b > 100)
            return true;
        return false;
    }
}