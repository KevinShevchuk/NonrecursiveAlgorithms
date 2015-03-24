/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kevin Shevchuk
 * 
 * The following is a test of several non-recursive algorithms including:
 * 
 * Largest element: finding the largest number in an array.
 * Uniqueness: checking whether all elements in the array are unique.
 * Matrix Multiplication: multiplying two square matrices together.
 * Binary Digits: counts the number of digits in a binary representation of a number.
 */
public class NonrecursiveAlgorithms 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        NonrecursiveAlgorithms nra = new NonrecursiveAlgorithms();
        nra.run();
    }
    
    
    /**
     * Runs through each task sequentially prompting the user for values, computing
     * results and timing each task.
     */
    public void run()
    {
        // Generate the Array for the largest element and uniqueness tests.
        Scanner in = new Scanner(System.in);
        System.out.println("Preparing Largest Element and Uniqueness tests...");
        System.out.println("Enter the size of the testing array: "); 
        int arraySize = in.nextInt();
        System.out.println("Specify the maximum value to generate: ");
        int maxValue = in.nextInt();
        int[] array = generateArray(1, maxValue, arraySize);
        
        // Run the Largest Element test and check the runtime.
        LargestElement le = new LargestElement();
        long start = System.nanoTime();
        int largestValue = le.findLargestValue(array);
        long end = System.nanoTime();
        long elapsedTime = (end - start);
        
        // Print results.
        printArray(array);
        System.out.println("");
        System.out.println("---LARGEST ELEMENT TEST---");
        System.out.println("Solution: " + largestValue);
        System.out.println("Runtime: " + elapsedTime + " Nanoseconds\n");
        
        // Run the uniqueness test and check the runtime.
        UniqueElements ue = new UniqueElements();
        start = System.nanoTime();
        int uniqueness = ue.checkUniqueness(array);
        end = System.nanoTime();
        elapsedTime = (end - start);
        
        // Print results.
        System.out.println("---UNIQUE ELEMENT TEST---");
        if(uniqueness == -1)
        {
            System.out.println("All elements are unique");
        }
        else
        {
            System.out.println(uniqueness + " is not unique");
        }      
        System.out.println("Runtime: " + elapsedTime + " Nanoseconds\n");
    
        //Prepare for Matrix Multiplication.
        System.out.println("Preparing Matrix Multiplication tests...");
        System.out.println("Enter the size of the testing array: "); 
        int matrixSize = in.nextInt();
        System.out.println("Specify the maximum value that can be in the matrix: ");
        maxValue = in.nextInt();
        
        // Run the matrix multiplication and check the runtime.
        MatrixMultiplication mm = new MatrixMultiplication();
        double[][] matrixA = generateMatrices(matrixSize, maxValue, false);
        double[][] matrixB = generateMatrices(matrixSize, maxValue, false);
        double[][] matrixC = generateMatrices(matrixSize, maxValue, true);
        start = System.nanoTime();
        double[][] resultMatrix = mm.multiplyMatrices(matrixA, matrixB, matrixC);
        end = System.nanoTime();
        elapsedTime = (end - start);
        
        // Print the results.
        System.out.println("---MATRIX MULTIPLICATION TEST---");
        System.out.println("\n\nMatrix A");
        printMatrix(matrixA);
        System.out.println("\n\nMatrix B");
        printMatrix(matrixB);
        System.out.println("\n\nResult");
        printMatrix(resultMatrix);
        System.out.println("\n\nRuntime: " + elapsedTime + " Nanoseconds");
        
        //Prepare for Binary Digits Test.
        System.out.println("Specify an integer to count the binary digits of: ");
        int number = in.nextInt();
        
        BinaryDigits bd = new BinaryDigits();
        start = System.nanoTime();        
        int count = bd.computeBinaryDigits(number);
        end = System.nanoTime();
        elapsedTime = (end - start);
        
        //print results
        System.out.println("There are " + count + " digits in the number " + number);
        System.out.println("\n\nRuntime: " + elapsedTime + " Nanoseconds");
    }
    
    
    /**
     * Generates an array filled with random integers positioned between the min
     * and the max value.
     * 
     * @param min minimum value, usually 1
     * @param max maximum value, usually 1,000,000
     * @param arraySize size of the array as specified by the user
     * @return 
     */
    public int[] generateArray(int min, int max, int arraySize)
    {       
        int[] array = new int[arraySize];
        Random rnd = new Random();
        for(int i = 0;i < array.length;i++)
        {
            array[i] = rnd.nextInt((max - min) + 1) + min;
        }
        return array;
    }
    
    /**
     * Generate a matrix of NxN size and fill it with random numbers;
     * 
     * @param matrixSize
     * @param zeroFill
     * @return 
     */
    private double[][] generateMatrices(int matrixSize, int maxValue, boolean zeroFill) 
    {
        Random rnd = new Random();
        double[][] matrix = new double[matrixSize][matrixSize];
        if (zeroFill == true)
        {
            return matrix; // matrix contains all zeroes
        }
        else
        {
            for( int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    // Fill a slot with a number between 1 and 20.
                    matrix[i][j] = rnd.nextInt(maxValue);
                }
            }
            return matrix;
        }
    }
    
    
    /**    
     * Formats the array to display its contents nicely in the console window.
     * 
     * @param array the generated array used during the test. 
     */
    public void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(i % 20 == 0 && i != 0) //Print every 20 values on the next line.
            {
                System.out.println(array[i]);
            }
            else
            {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("");
    }
    
    
    /**
     * Prints the matrix in the console.
     * 
     * @param matrix 
     */
    public void printMatrix(double[][] matrix)
    {
        for(int j = 0; j < matrix.length; j++)
        {
            System.out.println("");
            for(int i = 0; i < matrix.length; i++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
}
