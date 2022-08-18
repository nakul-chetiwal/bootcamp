/*2) Declare and initialize an array with four arbitrary whole numbers.
  Write a Java program to copy this array by iterating it.*/
package pack_Inheritance_encap_day3;

import java.util.Random;

public class IteratingArray {

    public static void main(String[] args) {
        randomInitialize();

    }
    static void randomInitialize(){
        Random rd = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10); // Assigning random integers between 1-10
            System.out.println(arr[1]);
        }
    }

}