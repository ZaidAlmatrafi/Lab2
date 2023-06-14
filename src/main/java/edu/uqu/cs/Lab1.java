package edu.uqu.cs;
/*
 * Lab 1 - Arrays
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Lab1 {

    /************ Part 1 **************/
    /**
     * Code a method named "printArray" that takes an array of intergers as a
     * parameter and prints them in a single line.
     * Values are reparated by commas.
     * Example:
     * If the argument is an array: numbers = {1,2,3,4}
     * then, printArray(numbers) shall print the following line:
     * 1,2,3,4
     */


    /* Write your code for Part 1 here */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
           }
        }
        System.out.println();
    }

    /************ Part 2 **************/
    /**
     * Code a method named readArrayReversed that reads 5 integers and returns an
     * array of the entered integers
     * but stored in the reverse order of their input order. Note that this method 
     * should not print the entered numbers.
     * Example:
     * If the input is:
     * 1 2 3 4 5
     * 
     * and we call the method as follows :
     * int[] numbers = readArrayReversed();
     * 
     * then, numbers should contain: {5,4,3,2,1}
     */

    /* Write your code for Part 2 here */
    public static int[] readArrayReversed() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[numbers.length - 1 - i] = scanner.nextInt();
        }
        return numbers;
    }

    /************ Part 3 **************/
    /**
     * Code a method named findNumberInArray that takes two parameters and returns a String. 
     * The first parameter is an array of integers. 
     * The second parameter is an int.
     * The method should retrun a string representation the number if found. 
     * Otherwise, the method should print "NotFound"
     * Example:
     * If the arguments given are: numbers = {1,2,3,4}, and 1
     * The output is: 1
     * 
     * If the arguments given are: numbers = {1,2,3,4}, and 10
     * The output is: NotFound
     */

     /* Write your code for Part 3 here */
    public static String findNumberInArray(int[] numbers, int numberToFind) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                return String.valueOf(numbers[i]);
            }
        }
        return "NotFound";
    }

    public static void main(String[] args) {

        /* You are not required to write any code here */
        // System.out.println(Arrays.toString(numbers));
        int[] numbers1 = {2, 5, 7, 4, 6};
        printArray(numbers1);
        
        int[] numbers2 = readArrayReversed();
        printArray(numbers2);

        int[] numbers = {1, 2, 3, 4, 5};
        int numberToFind = 3;
        String result = findNumberInArray(numbers, numberToFind);
        System.out.println(result);
    }

}