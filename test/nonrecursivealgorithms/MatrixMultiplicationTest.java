/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Shevchuk
 */
public class MatrixMultiplicationTest {
    
    public MatrixMultiplicationTest() {
    }

    /**
     * Test of multiplyMatrices method, of class MatrixMultiplication.
     */
    @Test
    public void testMultiplyMatrices() {
        System.out.println("Testing Multiply Matrices...");
        double[][] matrixA = {{ 1, 3, 7},{ 2, 1, 6},{ 8, 8, 9}};
        double[][] matrixB = {{ 3, 2, 2},{ 6, 5, 3},{ 9, 7, 1}};
        double[][] matrixC = {{ 0, 0, 0},{ 0, 0, 0},{ 0, 0, 0}};
        MatrixMultiplication instance = new MatrixMultiplication();
        double[][] expResult = {{84, 66, 18},{ 66, 51, 13},{ 153, 119, 49}};
        double[][] result = instance.multiplyMatrices(matrixA, matrixB, matrixC);
        assertArrayEquals(expResult, result);
    }
    
}
