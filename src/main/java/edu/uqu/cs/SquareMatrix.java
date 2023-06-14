package edu.uqu.cs;

public class SquareMatrix {

    private int[][] matrix;

    // the square matrix's dimension
    final private int DIMENSION = 2;

    public SquareMatrix() {
        // assign the matrix to a new 2d array
        // which will make it all zeros {{0, 0},{0, 0}}
        matrix = new int[DIMENSION][DIMENSION];
    }

    public SquareMatrix(int[][] array) {
        // matrix = array; will copy the address, which might affect the program
        // so we will loop and copy each value

        // initialize the matrix
        matrix = new int[DIMENSION][DIMENSION];

        // loop for each row
        for (int row = 0; row < array.length; row++) {
            // loop for each column in that row
            for (int col = 0; col < array[row].length; col++) {
                // copy the value at [row][column]
                matrix[row][col] = array[row][col];
            }
        }
    }

    public String dim() {
        return DIMENSION + "";
    }

    public int[][] getData() {
        // return a reference
        return matrix;
    }

    public int[][] getValues() {
        int[][] array = new int[DIMENSION][DIMENSION];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = matrix[row][col];
            }
        }
        return array;
    }

    public SquareMatrix add(SquareMatrix otherMatrix) {
        // create a new square 2x2 matrix
        int[][] result = new int[DIMENSION][DIMENSION];
        // get the other matrix's data and store it
        int[][] otherMatrixData = otherMatrix.getData();

        // loop for each value
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = matrix[row][col] + otherMatrixData[row][col];
            }
        }

        return new SquareMatrix(result);
    }

    public SquareMatrix mul(SquareMatrix otherMatrix) {
        // create a new square 2x2 matrix
        int[][] result = new int[DIMENSION][DIMENSION];
        // get the other matrix's data and store it
        int[][] otherMatrixData = otherMatrix.getData();

        // loop for each row
        for (int row = 0; row < result.length; row++) {
            // loop for each column
            for (int col = 0; col < result[row].length; col++) {
                // loop twice (or as much as the dimension of the array)
                for (int k = 0; k < DIMENSION; k++) {
                    result[row][col] += matrix[row][k] * otherMatrixData[k][col];
                }
                /*
                the last for k loop, is the same as:
                result[row][col] += matrix[row][0] * otherMatrixData[0][col];
                result[row][col] += matrix[row][1] * otherMatrixData[1][col];
                */
            }
        }

        return new SquareMatrix(result);
    }
}
