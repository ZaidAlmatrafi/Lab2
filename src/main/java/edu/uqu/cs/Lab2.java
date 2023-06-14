package edu.uqu.cs;
/*
 * Lab 2 - Intro OOP
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;


public class Lab2 {

    /************ Part 1 **************/
    /**
     * Code a method named "cacluateTriangleArea" that reads two floating point numbers 
     * representing the base and the height of a triangle.
     * 
     * The method shall create an object of the Triangle class (refer to Triangle.java) using the input values.
     * The method shall return the area of the triangle using the triangle's method call.
     * 
     * Example:
     * Input: 
     * 2.0 4.0
     * 
     * The method shall return the value: 4.0
     */

    public static double cacluateTriangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        Triangle triangle = new Triangle();
        triangle.setBase(base);
        triangle.setHeight(height);
        triangle.getArea();
        triangle.printInfo();

        return triangle.getArea();
    }

    /************ Part 2 **************/
    /**
     * Code new class called SquareMatrix that uses a 2x2 2D array as a private field. 
     * 
     * Important!!! ****** Put your code in another file called SquareMatrix.java ********
     * 
     * There should two constructors. An empty constructor which shall initialize the 2x2 matrix to zeros. 
     * The second constructor takes a 2x2 array an initlizes the matrix to the values of the given array.
     * 
     * The class should have four public methods:
     * 
     * dim: takes no arguments and returns a String with the diminsions.
     * For example, if the diminsion is 2, calling dim() should return "2x2"
     * 
     * getValues: takes no arguments and returns a reference to the 2x2 array used to store the matrix's values
     *  
     * add: takes another matrix object as an argument and returns the result of 
     * the addition of that matrix and the current matrix object
     * For example, if we have matrix mA = | 1  5 |
     *                                     |-4  3 |
     * and matrix mB = | 2 -1 |
     *                 | 4 -1 |
     * mA.add(mB) should return a SquareMatrix object with values | 3  4 | 
     *                                                            | 0  2 |
     * 
     * mul: takes another matrix object as an argument and returns the result of 
     * the multiplication of that matrix and the current matrix object
     * 
     * For example, if we have matrix mA = | 7  5 |
     *                                     | 6  3 |
     * and matrix mB = | 2  1 |
     *                 | 5  1 |
     * mA.mul(mB) should return a SquareMatrix object with values | 39  12 |
     *                                                            | 27   9 |
     * 
     */

    public static void main(String[] args) {

        /* You are not required to write any code here */
 
    }

}