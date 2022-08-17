/*

2) Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false
 */
import java.util.Scanner;
        import java.util.InputMismatchException;
        public class BooleanCompare {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter b1: ");
            boolean b1 = scan.nextBoolean();
            System.out.println("Enter b2: ");
            boolean b2 = scan.nextBoolean();
            System.out.println("result : "+compare(b1,b2));
        }
        catch (InputMismatchException e) {
            System.out.println("xx");
        }
    }
    static boolean compare(Boolean b1,Boolean b2)
    {
        if(b1==b2)
            return true;
        return false;
    }
}