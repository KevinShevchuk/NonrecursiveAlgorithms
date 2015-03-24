/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

/**
 *
 * @author Kevin Shevchuk
 */
public class MatrixMultiplication 
{
    public MatrixMultiplication()
    {
        
    }
    
    
    /**
     * multiplies two square matrices together.
     * 
     * @param matrixA first input matrix
     * @param matrixB second input matrix
     * @param matrixC the zerofilled matrix to be returned.
     * @return matrixC filled with the results of the multiplication.
     */
    public double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB, double[][] matrixC)
    {
        for( int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrixC[i][j] = 0;
                for (int k = 0; k < 3; k++)
                {
                    matrixC[i][j] =(matrixC[i][j] + matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return matrixC;
    }
}
